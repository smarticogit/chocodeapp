package br.com.chocode.back.dao;

import br.com.chocode.back.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoDAO extends JpaRepository<Pedido, Long> {

}
