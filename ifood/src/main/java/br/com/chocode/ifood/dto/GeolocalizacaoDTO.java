package br.com.chocode.ifood.dto;

import java.time.LocalDateTime;

public class GeolocalizacaoDTO {
	
	private Long id;
	private String longitude;
	private String latitude;
	private LocalDateTime data;
	private EntregadorDTO entregador;
	
	public GeolocalizacaoDTO(Long id, String longitude, String latitude, LocalDateTime data, EntregadorDTO entregador) {
		
		super();
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
		this.data = data;
		this.entregador = entregador;
	}
	
	
	public GeolocalizacaoDTO() {
		super();
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
	public EntregadorDTO getEntregador() {
		return entregador;
	}
	public void setEntregador(EntregadorDTO entregador) {
		this.entregador = entregador;
	}
	
	

}
