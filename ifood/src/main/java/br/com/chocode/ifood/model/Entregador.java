package br.com.chocode.ifood.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Entregador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email; //unic?
	private String senha;

	@OneToMany(mappedBy = "entregador")
	@JsonIgnore
	private Set<Geolocalizacao> geo = new HashSet<>();
	
	@OneToMany(mappedBy = "entregador")
	@JsonIgnore
	private Set<Pedido> pedido = new HashSet<>();
	
	@Column(name = "url_image")
	private String urlImage;
	
	public Entregador() {}
	

	public Entregador(Long id, String nome, String email, String senha, Set<Geolocalizacao> geo, Set<Pedido> pedido,
			String urlImage) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.geo = geo;
		this.pedido = pedido;
		this.urlImage = urlImage;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Set<Geolocalizacao> getGeo() {
		return geo;
	}


	public void setGeo(Set<Geolocalizacao> geo) {
		this.geo = geo;
	}


	public Set<Pedido> getPedido() {
		return pedido;
	}


	public void setPedido(Set<Pedido> pedido) {
		this.pedido = pedido;
	}


	public String getUrlImage() {
		return urlImage;
	}


	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}



	
	
}
