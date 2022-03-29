package br.com.chocode.back.services;

import br.com.chocode.back.DTO.GeolocalizacaoDTO;
import br.com.chocode.back.dao.GeolocalizacaoDAO;
import br.com.chocode.back.model.Geolocalizacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.ClassTypeInformation;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Component
public class GeolocalizacaoServiceImpl implements IGeolocalizacaoService {

	@Autowired
	private GeolocalizacaoDAO dao;

	@Autowired
	private EntregadorServiceImpl entregadorService;

	@Autowired
	private PedidoServiceImpl pedidoService;


	@Override
	public GeolocalizacaoDTO save(GeolocalizacaoDTO geolocalizacaoDTO) {
		List<GeolocalizacaoDTO> geosDoBancoDTO = findByPedidoId(geolocalizacaoDTO.getIdPedido());
		for (GeolocalizacaoDTO geolocalizacaoDTO1 : geosDoBancoDTO){
			if (geolocalizacaoDTO.getLatitude().equals(geolocalizacaoDTO1.getLatitude())
					&& geolocalizacaoDTO.getLongitude().equals(geolocalizacaoDTO1.getLongitude())){
				return null;
			}
		}
		Geolocalizacao geolocalizacao = new Geolocalizacao(geolocalizacaoDTO);
		LocalDateTime now = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
		geolocalizacao.setData(now);
		geolocalizacao.setPedido(pedidoService.findById(geolocalizacaoDTO.getIdPedido()));
		if (geolocalizacao == null || geolocalizacao.getPedido().getEntregador() == null || !geolocalizacao.getPedido().getEntregador().getId().equals(geolocalizacaoDTO.getIdEntregador()))
			return null;
		geolocalizacao.setEntregador(geolocalizacao.getPedido().getEntregador());
		GeolocalizacaoDTO geolocalizacaoDTO1 = new GeolocalizacaoDTO(dao.saveAndFlush(geolocalizacao));
		return geolocalizacaoDTO1;
	}

	@Override
	public List<GeolocalizacaoDTO> findAll() {
		List<Geolocalizacao> listaGeos = dao.findAll();
		List<GeolocalizacaoDTO> listaGeosDTO = new ArrayList<>();
		for (Geolocalizacao geolocalizacao : listaGeos)
			listaGeosDTO.add(new GeolocalizacaoDTO(geolocalizacao));
		return listaGeosDTO;
	}

	@Override
	public List<GeolocalizacaoDTO> findByPedidoId(Long id) {
		List<Geolocalizacao> listaGeo = dao.findByPedidoId(id);
		List<GeolocalizacaoDTO> listaGeoDTO = new ArrayList<>();
		for (Geolocalizacao geolocalizacao:listaGeo)
			listaGeoDTO.add(new GeolocalizacaoDTO(geolocalizacao));
		return listaGeoDTO;
	}

	@Override
	public Geolocalizacao findById(Long id) {
		return dao.findById(id).get();
	}
}
