package br.com.chocode.ifood.dto;

import java.util.HashSet;
import java.util.Set;
import br.com.chocode.ifood.model.Geolocalizacao;
import br.com.chocode.ifood.model.Pedido;


public class PedidoDTO {
	
	private Long id;
	private String nomeRestaurante;
	private String produto;
	private String status;
	private EntregadorDTO entregador;
	private ClienteDTO cliente;
	private Set<GeolocalizacaoDTO> geo = new HashSet<>();
	
	public PedidoDTO() {}
	
	public PedidoDTO(Pedido pedido) {
		super();
		this.id = pedido.getId();
		this.nomeRestaurante = pedido.getNomeRestaurante();
		this.produto = pedido.getProduto();
		this.status = pedido.getStatus();
		this.entregador = new EntregadorDTO(pedido.getEntregador());
		this.cliente = new ClienteDTO(pedido.getCliente());
		for(Geolocalizacao geo : pedido.getGeo()) {
			this.geo.add(new GeolocalizacaoDTO(geo));
		}
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

	public Set<GeolocalizacaoDTO> getGeo() {
		return geo;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public EntregadorDTO getEntregador() {
		return entregador;
	}

	public void setEntregador(EntregadorDTO entregador) {
		this.entregador = entregador;
	}

	
}
