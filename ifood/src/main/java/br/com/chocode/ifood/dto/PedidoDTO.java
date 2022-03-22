package br.com.chocode.ifood.dto;

import br.com.chocode.ifood.model.Cliente;
import br.com.chocode.ifood.model.Pedido;

public class PedidoDTO {
	
	private Long id;
	private String status;
	private String nomeRestaurante;
	private Cliente cliente;
	
	public PedidoDTO() {}
	
	public PedidoDTO(Pedido pedido) {
		super();
		this.id = pedido.getId();
		this.status = pedido.getStatus();
		this.nomeRestaurante = pedido.getNomeRestaurante();
		this.cliente = pedido.getCliente();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNomeRestaurante() {
		return nomeRestaurante;
	}

	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
}
