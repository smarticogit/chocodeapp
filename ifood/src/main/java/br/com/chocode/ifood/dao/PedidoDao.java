package br.com.chocode.ifood.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.chocode.ifood.model.Pedido;

public interface PedidoDao extends CrudRepository<Pedido, Long>{

}
