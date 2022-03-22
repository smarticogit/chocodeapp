package br.com.chocode.ifood.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.chocode.ifood.model.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long>{

}
