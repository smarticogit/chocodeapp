package br.com.chocode.ifood.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chocode.ifood.model.Pedido;

public interface PedidoDAO extends JpaRepository<Pedido, Long> {

}
