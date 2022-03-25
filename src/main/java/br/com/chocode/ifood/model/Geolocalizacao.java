package br.com.chocode.ifood.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	private Entregador entregadorG;

	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;

	public Geolocalizacao() {}
	
<<<<<<< HEAD:src/main/java/br/com/chocode/ifood/model/Geolocalizacao.java

	public Geolocalizacao(Long id, String latitude, String longitude, LocalDateTime data, Entregador entregadorG,
=======
	public Geolocalizacao(Long id, String latitude, String longitude, LocalDateTime data, Entregador entregador,
>>>>>>> main:ifood/src/main/java/br/com/chocode/ifood/model/Geolocalizacao.java
			Pedido pedido) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.data = data;
		this.entregadorG = entregadorG;
		this.pedido = pedido;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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


	public LocalDateTime getData() {
		return data;
	}


	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Entregador getEntregadorG() {
		return entregadorG;
	}

	public void setEntregadorG(Entregador entregadorG) {
		this.entregadorG = entregadorG;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

<<<<<<< HEAD:src/main/java/br/com/chocode/ifood/model/Geolocalizacao.java

=======
>>>>>>> main:ifood/src/main/java/br/com/chocode/ifood/model/Geolocalizacao.java
}