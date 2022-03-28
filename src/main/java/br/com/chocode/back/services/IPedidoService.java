package br.com.chocode.back.services;

import br.com.chocode.back.DTO.PedidoDTO;
import br.com.chocode.back.DTO.StatusDTO;
import br.com.chocode.back.model.Pedido;

import java.util.List;

public interface IPedidoService {

	public Pedido save(PedidoDTO pedidoDTO);

	public Pedido saveEntregador(Long idPedido, Long idEntregador);

	public Pedido saveStatus(Long idPedido, StatusDTO status);

	public Pedido statusCancelado(Long idPedido, Long idEntregador);

	public Pedido statusEntregue(Long idPedido, Long idEntregador);

	public List<Pedido> findAll();

	public List<PedidoDTO> findAllAguardando();

	public Pedido findById(Long id);

}
