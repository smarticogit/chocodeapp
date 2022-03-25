package br.com.chocode.ifood.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_restaurante")
	private String nomeRestaurante;
	private String produto;
	private String status;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Long> idGeo = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "entregador_id")
	private Entregador entregadorP;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;


	public Pedido(Long id, String nomeRestaurante, String produto, String status, Set<Long> idGeo,
			Entregador entregadorP, Cliente cliente) {
		super();
		this.id = id;
		this.nomeRestaurante = nomeRestaurante;
		this.produto = produto;
		this.status = status;
		this.idGeo = idGeo;
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


	public Set<Long> getIdGeo() {
		return idGeo;
	}


	public void setIdGeo(Set<Long> idGeo) {
		this.idGeo = idGeo;
	}

<<<<<<< HEAD:src/main/java/br/com/chocode/ifood/model/Pedido.java

	public Entregador getEntregadorP() {
=======
	public Entregador getEntregador() {
>>>>>>> main:ifood/src/main/java/br/com/chocode/ifood/model/Pedido.java
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

<<<<<<< HEAD:src/main/java/br/com/chocode/ifood/model/Pedido.java
	
	

=======
>>>>>>> main:ifood/src/main/java/br/com/chocode/ifood/model/Pedido.java
}
