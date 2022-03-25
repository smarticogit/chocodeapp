package br.com.chocode.ifood.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String endereco;
	private String latitude;
	private String longitude;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Long> idPedidos = new HashSet<>();
	
	public Cliente() {}

	public Cliente(Long id, String nome, String endereco, String latitude, String longitude, Set<Long> idPedidos) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.latitude = latitude;
		this.longitude = longitude;
		this.idPedidos = idPedidos;
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

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Set<Long> getIdPedidos() {
		return idPedidos;
	}

	public void setIdPedidos(Set<Long> idPedidos) {
		this.idPedidos = idPedidos;
	}

	
}
