package br.com.chocode.back.services;

import br.com.chocode.back.DTO.PedidoDTO;
import br.com.chocode.back.dao.PedidoDAO;
import br.com.chocode.back.model.Geolocalizacao;
import br.com.chocode.back.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	private PedidoDAO dao;

	@Autowired
	private EntregadorServiceImpl entregadorService;

	@Autowired
	private ClienteServiceImpl clienteService;

	@Autowired
	private GeolocalizacaoServiceImpl geoService;

	public Pedido save(PedidoDTO pedidoDTO) {

		Pedido pedido = new Pedido(pedidoDTO, clienteService.findById(pedidoDTO.getIdCliente()));
		return dao.saveAndFlush(pedido);
	}

	public Pedido saveEntregador(Long idPedido, Long idEntregador) {
		Pedido pedido = findById(idPedido);
		pedido.setEntregador(entregadorService.findById(idEntregador));
		return dao.saveAndFlush(pedido);
	}

	public Pedido saveStatus(Long idPedido, String status) {
		Pedido pedido = findById(idPedido);
		pedido.setStatus(status);
		return dao.saveAndFlush(pedido);
	}

	public List<Pedido> findAll() {
		List<Pedido> listaPedidos = dao.findAll();
		return listaPedidos;
	}

	public List<Geolocalizacao> findAllGeo(Long idPedido) {
		List<Geolocalizacao> listaGeo = geoService.findAll();
		return listaPedidos;
	}

	public Pedido findById(Long id) {
		return dao.findById(id).get();
	}

}
