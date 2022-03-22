package br.com.chocode.ifood.dto;

import br.com.chocode.ifood.model.Cliente;
import br.com.chocode.ifood.model.Pedido;

public class PedidoDTO {
	
	private Long id;
	private String status;
	private String nomeRestaurante;
	private Cliente cliente;
	
	public PedidoDTO(Pedido pedido) {
		super();
		this.id = pedido.getId();
		this.status = pedido.getStatus();
		this.nomeRestaurante = pedido.getNomeRestaurante();
		this.cliente = pedido.getCliente();
	}
	
	public PedidoDTO() {
		super();
	}
	
	
}
