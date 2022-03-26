package br.com.chocode.back.services;

import br.com.chocode.back.DTO.GeolocalizacaoDTO;
import br.com.chocode.back.dao.GeolocalizacaoDAO;
import br.com.chocode.back.model.Geolocalizacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
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
	public Geolocalizacao save(GeolocalizacaoDTO geolocalizacaoDTO) {
		Geolocalizacao geolocalizacao = new Geolocalizacao(geolocalizacaoDTO);
		LocalDateTime now = LocalDateTime.now();
		geolocalizacao.setData(now);
		geolocalizacao.setPedido(pedidoService.findById(geolocalizacaoDTO.getIdPedido()));
		if (geolocalizacao.getPedido().getEntregador().getId() != geolocalizacaoDTO.getIdEntregador())
			return null;
		geolocalizacao.setEntregador(entregadorService.findById(geolocalizacaoDTO.getIdEntregador()));
		return dao.saveAndFlush(geolocalizacao);
	}

	@Override
	public List<Geolocalizacao> findAll() {
		List<Geolocalizacao> listaGeos = dao.findAll();
		return listaGeos;
	}

	@Override
	public Geolocalizacao findById(Long id) {
		return dao.findById(id).get();
	}
}
