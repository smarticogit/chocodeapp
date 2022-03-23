package br.com.chocode.ifood.dto;

import java.util.HashSet;
import java.util.Set;

import br.com.chocode.ifood.model.Entregador;
import br.com.chocode.ifood.model.Geolocalizacao;
import br.com.chocode.ifood.model.Pedido;

public class EntregadorDTO {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String urlImage;
	private Set<GeolocalizacaoDTO> geo = new HashSet<>();
	private Set<PedidoDTO> pedido = new HashSet<>();
	
	
	public EntregadorDTO() {}

	public EntregadorDTO(Entregador entregador) {
		super();
		this.id = entregador.getId();
		this.nome = entregador.getNome();
		this.email = entregador.getEmail();
		this.senha = entregador.getSenha();
		this.urlImage = entregador.getUrlImage();
		for(Geolocalizacao geo : entregador.getGeo()) {
			this.geo.add(new GeolocalizacaoDTO(geo));
		}
		for(Pedido pedido : entregador.getPedido()) {
			this.pedido.add(new PedidoDTO(pedido));
		}
	}

	public Set<GeolocalizacaoDTO> getGeo() {
		return geo;
	}

	public Set<PedidoDTO> getPedido() {
		return pedido;
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
