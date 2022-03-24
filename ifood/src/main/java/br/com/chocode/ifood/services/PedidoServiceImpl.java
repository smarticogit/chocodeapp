package br.com.chocode.ifood.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.chocode.ifood.dao.PedidoDAO;
import br.com.chocode.ifood.dto.PedidoDTO;
import br.com.chocode.ifood.model.Pedido;

@Component
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	private PedidoDAO dao;
	
	private PedidoDTO save(PedidoDTO pedidoDTO) {
		Pedido pedido = new Pedido(pedidoDTO);
		return new PedidoDTO(dao.saveAndFlush(pedido));
	}

	public List<PedidoDTO> findAll() {
		List<Pedido> lista = (List<Pedido>) dao.findAll();
		List<PedidoDTO> listaDTO = new ArrayList<>();
		for (Pedido pedido01 : lista) {
			listaDTO.add(new PedidoDTO(pedido01));
		}
		return listaDTO;
	}

	public PedidoDTO findById(Long id) {
		PedidoDTO pedidoDTO = new PedidoDTO(dao.findById(id).get());
		return pedidoDTO;
	}
	
	
//	Update de pedido, antes dele ser atribuido a um entregador.
	public PedidoDTO update(Long id, PedidoDTO pedido) {
		PedidoDTO pedidoDTOBanco = findById(id);
		if(pedido.getEntregador() == null && pedidoDTOBanco.getEntregador() == null) {
			if(pedidoDTOBanco != null) {
				if(pedido.getNomeRestaurante() != null)
					pedidoDTOBanco.setNomeRestaurante(pedido.getNomeRestaurante());
				if(pedido.getProduto() != null)
					pedidoDTOBanco.setProduto(pedido.getProduto());
				if(pedido.getCliente() != null)
					pedidoDTOBanco.setCliente(pedido.getCliente());
				return save(pedidoDTOBanco);
			}
		}
		return null;
	}

//	O metodo setStatus so atribui de for "Entregue" ou "Cancelado"
	public PedidoDTO updateStatus(Long id, String status) {
		PedidoDTO pedidoDTO = findById(id);
		if(pedidoDTO != null)
			if(pedidoDTO.setStatus(status))
				return save(pedidoDTO);
		return null;
	}
	
	public void delete(Long id) {
		dao.deleteById(id);
	}


}
