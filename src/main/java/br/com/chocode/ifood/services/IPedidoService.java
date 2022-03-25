package br.com.chocode.ifood.services;

import java.util.List;

import br.com.chocode.ifood.model.Pedido;

public interface IPedidoService {

	public Pedido save(Pedido pedido);
	
	public List<Pedido> findAll();
	
	public Pedido findById(Long id);

//	public PedidoDTO updateStatus(Long id, String status);
}
