package br.com.chocode.ifood.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
	private String email;
	private String senha;
	
	@Column(name = "url_image")
	private String urlImage;

	@OneToMany(mappedBy = "entregadorG", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Long> idGeo = new HashSet<>();
	
	@OneToMany(mappedBy = "entregadorP", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Long> idPedido = new HashSet<>();
	
	
	public Entregador() {}
	
	public Entregador(Long id, String nome, String email, String senha, String urlImage, Set<Long> idGeo,
			Set<Long> idPedido) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.urlImage = urlImage;
		this.idGeo = idGeo;
		this.idPedido = idPedido;
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

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public Set<Long> getIdGeo() {
		return idGeo;
	}

	public void setIdGeo(Set<Long> idGeo) {
		this.idGeo = idGeo;
	}

	public Set<Long> getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Set<Long> idPedido) {
		this.idPedido = idPedido;
	}

	
}
