package br.com.chocode.back.model;

import javax.persistence.*;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_restaurante", nullable = false)
	private String nomeRestaurante;

	@Column(name = "produto", nullable = false)
	private String produto;

	@Column(name = "status", nullable = false)
	private String status;

	@ManyToOne
	@JoinColumn(name = "entregador_id")
	private Entregador entregadorP;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Pedido() {
	}

	public Pedido(Long id, String nomeRestaurante, String produto, String status, Entregador entregadorP,
			Cliente cliente) {
		this.id = id;
		this.nomeRestaurante = nomeRestaurante;
		this.produto = produto;
		this.status = status;
		this.entregadorP = entregadorP;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeRestaurante() {
		return nomeRestaurante;
	}

	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Entregador getEntregadorP() {
		return entregadorP;
	}

	public void setEntregadorP(Entregador entregadorP) {
		this.entregadorP = entregadorP;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
