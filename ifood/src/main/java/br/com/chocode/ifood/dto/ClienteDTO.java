package br.com.chocode.ifood.dto;

import java.time.LocalDateTime;

public class ClienteDTO {
	
	private Long id;
	private String nome;
	private String endereco;
	private String longitude;
	private String latitude;
	private PedidoDTO pedido;
	
	public ClienteDTO(Long id, String nome, String endereco, String longitude, String latitude, PedidoDTO pedido) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.longitude = longitude;
		this.latitude = latitude;
		this.pedido = pedido;
	}
	
	public ClienteDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public PedidoDTO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}
	
	
	
	

}
