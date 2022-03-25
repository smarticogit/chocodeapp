package br.com.chocode.back.dao;


import br.com.chocode.back.model.Geolocalizacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeolocalizacaoDAO extends JpaRepository<Geolocalizacao, Long> {

}
