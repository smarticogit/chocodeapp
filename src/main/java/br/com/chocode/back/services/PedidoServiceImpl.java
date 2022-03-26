package br.com.chocode.back.services;

import br.com.chocode.back.DTO.PedidoDTO;
import br.com.chocode.back.dao.PedidoDAO;
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

	public Pedido save(PedidoDTO pedidoDTO) {
		Pedido pedido = new Pedido(pedidoDTO);
		pedido.setCliente(clienteService.findById(pedidoDTO.getIdEntregador()));
		return dao.saveAndFlush(pedido);
	}

	public Pedido saveEntregador(Long idPedido, Long idEntregador) {
		Pedido pedido = findById(idPedido);
		pedido.setEntregador(entregadorService.findById(idEntregador));
		return dao.saveAndFlush(pedido);
	}

	public List<Pedido> findAll() {
		List<Pedido> listaPedidos = dao.findAll();
		return listaPedidos;
	}

	public Pedido findById(Long id) {
		return dao.findById(id).get();
	}

}
