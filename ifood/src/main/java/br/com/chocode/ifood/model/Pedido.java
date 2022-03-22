package br.com.chocode.ifood.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.chocode.ifood.dto.PedidoDTO;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_restaurante")
	private String nomeRestaurante;

	private String produto;
	private String status;

	@ManyToOne
	@JoinColumn(name = "geolocalizacao_id")
	private Set<Geolocalizacao> geo = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "entregador_id")
	private Entregador entregador;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Pedido(Long id, String nomeRestaurante, String produto, String status, Set<Geolocalizacao> geo,
			Entregador entregador, Cliente cliente) {
		super();
		this.id = id;
		this.nomeRestaurante = nomeRestaurante;
		this.produto = produto;
		this.status = status;
		this.geo = geo;
		this.entregador = entregador;
		this.cliente = cliente;
	}

	public Pedido(PedidoDTO pedido) {
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

	public Entregador getEntregador() {
		return entregador;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Set<Geolocalizacao> getGeo() {
		return geo;
	}

}
