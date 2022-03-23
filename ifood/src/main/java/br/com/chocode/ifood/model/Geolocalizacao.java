package br.com.chocode.ifood.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.chocode.ifood.dto.GeolocalizacaoDTO;
import br.com.chocode.ifood.dto.PedidoDTO;

@Entity
public class Geolocalizacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String latitude;
	private String longitude;
	private LocalDateTime data;
	
	@ManyToOne
	@JoinColumn(name = "entregador_id")
	private Entregador entregador;

	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Set<Pedido> pedido = new HashSet<>();

	public Geolocalizacao() {
	}
	

	public Geolocalizacao(Long id, String latitude, String longitude, LocalDateTime data, Entregador entregador,
			Set<Pedido> pedido) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.data = data;
		this.entregador = entregador;
		this.pedido = pedido;
	}
	
	public Geolocalizacao(GeolocalizacaoDTO geo) {
			
			super();
			this.id = geo.getId();
			this.longitude = geo.getLongitude();
			this.latitude = geo.getLatitude();
			this.data = geo.getData();
			this.entregador = new Entregador(geo.getEntregador());
			for(PedidoDTO pedidoDTO : geo.getPedido()) {
				pedido.add(new Pedido(pedidoDTO));
			}
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Entregador getEntregador() {
		return entregador;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}



	public Set<Pedido> getPedido() {
		return pedido;
	}




}
