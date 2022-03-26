package br.com.chocode.back.services;

import br.com.chocode.back.model.Pedido;

import java.util.List;

public interface IPedidoService {

	public Pedido save(Pedido pedido);

	public List<Pedido> findAll();

	public Pedido findById(Long id);

}
