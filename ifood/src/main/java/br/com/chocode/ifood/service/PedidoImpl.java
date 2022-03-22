package br.com.chocode.ifood.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.chocode.ifood.dao.PedidoDao;
import br.com.chocode.ifood.dto.PedidoDTO;
import br.com.chocode.ifood.model.Pedido;

@Component
public class PedidoImpl implements IPedidoService{
	
	@Autowired
	private PedidoDao dao;
	
	public List<PedidoDTO> findAll () {
		List<Pedido> lista = (List<Pedido>) dao.findAll();
		List<PedidoDTO> listaDTO = new ArrayList<>();
		for(Pedido pedido01: lista) {
			listaDTO.add(new PedidoDTO(pedido01));
		}
		return listaDTO;
	}	
}
