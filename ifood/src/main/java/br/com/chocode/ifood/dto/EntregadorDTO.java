package br.com.chocode.ifood.dto;

import br.com.chocode.ifood.model.Entregador;

public class EntregadorDTO {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String urlImage;

	public EntregadorDTO(Entregador entregador) {
		super();
		this.id = entregador.getId();
		this.nome = entregador.getNome();
		this.email = entregador.getEmail();
		this.senha = entregador.getSenha();
		this.urlImage = entregador.getUrlImage();
	}
	
	public EntregadorDTO() {
		super();
	}	
}
