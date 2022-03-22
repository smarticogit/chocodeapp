package br.com.chocode.ifood.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Geolocalizacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String latitude;
	private String longitude;
	private LocalDate data;
	
	@ManyToOne
	private Pedido pedido;
	
	@ManyToOne
	private Entregador entregador;
	
	public Geolocalizacao() {
		super();
	}

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
}
