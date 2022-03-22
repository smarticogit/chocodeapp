package br.com.chocode.ifood.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.chocode.ifood.dao.GeolocalizacaoDAO;
import br.com.chocode.ifood.dao.PedidoDAO;
import br.com.chocode.ifood.dto.PedidoDTO;
import br.com.chocode.ifood.model.Pedido;

@Component
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	private PedidoDAO dao;

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

	public PedidoDTO update(Long id, String status) {
		PedidoDTO pedidoDTO = findById(id);
		pedidoDTO.setStatus(status);
		save(pedidoDTO);
		return pedidoDTO;
	}

	private Pedido save(PedidoDTO pedidoDTO) {
		Pedido pedido = new Pedido(pedidoDTO);
		return dao.save(pedido);
	}

}
