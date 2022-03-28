package br.com.chocode.back.services;

import br.com.chocode.back.DTO.PedidoDTO;
import br.com.chocode.back.DTO.StatusDTO;
import br.com.chocode.back.dao.PedidoDAO;
import br.com.chocode.back.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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

		Pedido pedido = new Pedido(pedidoDTO, clienteService.findById(pedidoDTO.getIdCliente()));
		return dao.saveAndFlush(pedido);
	}

	public Pedido saveEntregador(Long idPedido, Long idEntregador) {
		Pedido pedido = findById(idPedido);
		pedido.setEntregador(entregadorService.findById(idEntregador));
		pedido.setStatus("A caminho.");
		return dao.saveAndFlush(pedido);
	}

	public Pedido statusCancelado(Long idPedido, Long idEntregador) {
		Pedido pedido = findById(idPedido);
		if (pedido == null || pedido.getEntregador() == null || !pedido.getEntregador().getId().equals(idEntregador))
			return null;
		pedido.setEntregador(null);
		pedido.setStatus("Aguardando entregador.");
		return dao.saveAndFlush(pedido);
	}

	public Pedido statusEntregue(Long idPedido, Long idEntregador) {
		Pedido pedido = findById(idPedido);
		if (pedido == null || pedido.getEntregador() == null || !pedido.getEntregador().getId().equals(idEntregador))
			return null;
		pedido.setStatus("Pedido entregue.");
		return dao.saveAndFlush(pedido);
	}

	public Pedido saveStatus(Long idPedido, StatusDTO status) {
		Pedido pedido = findById(idPedido);
		pedido.setStatus(status.getStatus());
		return dao.saveAndFlush(pedido);
	}

	public List<Pedido> findAll() {
		List<Pedido> listaPedidos = dao.findAll();
		return listaPedidos;
	}

	public List<PedidoDTO> findAllAguardando() {
		List<Pedido> listaPedidos = dao.findByEntregadorNull();
		List<PedidoDTO> listaPedidosDTO = new ArrayList<>();
		for (Pedido pedido : listaPedidos){
			if ( pedido.getCliente() != null)
				listaPedidosDTO.add(new PedidoDTO(pedido));
		}
		return listaPedidosDTO;
	}


	public Pedido findById(Long id) {
		Pedido pedido = dao.findById(id).get();
		return pedido;
	}

}
