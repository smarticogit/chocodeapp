package br.com.chocode.back.services;

import br.com.chocode.back.DTO.PedidoDTO;
import br.com.chocode.back.model.Pedido;

import java.util.List;

public interface IPedidoService {

	public Pedido save(PedidoDTO pedidoDTO);

	public Pedido saveEntregador(Long idPedido, Long idEntregador);

	public Pedido saveStatus(Long idPedido, String status);

	public List<Pedido> findAll();

	public Pedido findById(Long id);

}
