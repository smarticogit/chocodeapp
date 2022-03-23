package br.com.chocode.ifood.dto;

import br.com.chocode.ifood.model.Entregador;

public class EntregadorDTO {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String urlImage;
	
	
	public EntregadorDTO() {}

	public EntregadorDTO(Entregador entregador) {
		super();
		this.id = entregador.getId();
		this.nome = entregador.getNome();
		this.email = entregador.getEmail();
		this.senha = entregador.getSenha();
		this.urlImage = entregador.getUrlImage();
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
	
	
}
