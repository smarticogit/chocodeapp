package br.com.chocode.ifood.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Geolocalizacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String latitude;
	private String longitude;
	private LocalDate data;

	@ManyToOne
	@JoinColumn(name = "entregador_id")
	private Entregador entregador;

	@OneToMany(mappedBy = "geo")
	@JsonIgnore
	private Pedido pedido;

	public Geolocalizacao() {}

	public Geolocalizacao(Long id, String latitude, String longitude, LocalDate data, Pedido pedido,
			Entregador entregador) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.data = data;
		this.pedido = pedido;
		this.entregador = entregador;
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Entregador getEntregador() {
		return entregador;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
