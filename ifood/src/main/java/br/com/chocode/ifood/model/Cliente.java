package br.com.chocode.ifood.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String endereco;
	private String latitude;
	private String longitude;
	
	@OneToMany(mappedBy = "cliente")
	@JsonIgnore
	private Set<Pedido> pedidos = new HashSet<>();
	
	public Cliente(Long id, String nome, String endereco, String latitude, String longitude) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Cliente() {
		super();
	}
}
