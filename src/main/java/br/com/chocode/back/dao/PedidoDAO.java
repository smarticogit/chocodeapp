package br.com.chocode.back.dao;

import br.com.chocode.back.model.Geolocalizacao;
import br.com.chocode.back.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoDAO extends JpaRepository<Pedido, Long> {
    List<Pedido> findByEntregadorNull();
    //List<Pedido> findByStatus(String status);
}
