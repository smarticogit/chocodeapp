package br.com.chocode.ifood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;
	
	@Column(name = "nome_restaurante")
	private String nomeRestaurante;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Pedido(Long id, String status, String nomeRestaurante, Cliente cliente) {
		super();
		this.id = id;
		this.status = status;
		this.nomeRestaurante = nomeRestaurante;
		this.cliente = cliente;
	}

	public Pedido() {
		super();
	}
}