package br.com.chocode.back.DTO;

import java.time.LocalDateTime;

public class GeolocalizacaoCompDTO {

    private Long id;

    private String latitude;

    private String longitude;

    private LocalDateTime data;



    public GeolocalizacaoCompDTO(Long id, String latitude, String longitude, LocalDateTime data) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.data = data;

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

}
