package br.com.chocode.back.services;

import br.com.chocode.back.dao.PedidoDAO;
import br.com.chocode.back.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	private PedidoDAO dao;

	public Pedido save(Pedido pedido) {
		return dao.saveAndFlush(pedido);
	}

	public List<Pedido> findAll() {
		List<Pedido> lista = dao.findAll();
		return lista;
	}

	public Pedido findById(Long id) {
		return dao.findById(id).get();
	}

//	Update de pedido, antes dele ser atribuido a um entregador.
//	public Pedido update(Long id, Pedido pedido) {
//		Pedido pedidoBanco = findById(id);
//		if(pedido.getEntregador() == null && pedidoBanco.getEntregador() == null) {
//			if(pedidoBanco != null) {
//				if(pedido.getNomeRestaurante() != null)
//					pedidoDTOBanco.setNomeRestaurante(pedido.getNomeRestaurante());
//				if(pedido.getProduto() != null)
//					pedidoDTOBanco.setProduto(pedido.getProduto());
//				if(pedido.getCliente() != null)
//					pedidoDTOBanco.setCliente(pedido.getCliente());
//				return save(pedidoDTOBanco);
//			}
//		}
//		return null;
//	}

//	O metodo setStatus so atribui de for "Entregue" ou "Cancelado"
//	public PedidoDTO updateStatus(Long id, String status) {
//		PedidoDTO pedidoDTO = findById(id);
//		if(pedidoDTO != null)
//			if(pedidoDTO.setStatus(status))
//				return save(pedidoDTO);
//		return null;
//	}
//	
//	public void delete(Long id) {
//		dao.deleteById(id);
//	}

}
