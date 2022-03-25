package br.com.chocode.ifood.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chocode.ifood.model.Geolocalizacao;

public interface GeolocalizacaoDAO extends JpaRepository<Geolocalizacao, Long> {

}
