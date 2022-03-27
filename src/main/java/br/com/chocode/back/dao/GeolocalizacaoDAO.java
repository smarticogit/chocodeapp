package br.com.chocode.back.dao;

import br.com.chocode.back.model.Geolocalizacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GeolocalizacaoDAO extends JpaRepository<Geolocalizacao, Long> {
    List<Geolocalizacao> findByPedidoId(Long pedidoId);
}
