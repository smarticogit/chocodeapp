package br.com.chocode.ifood.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chocode.ifood.model.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Long> {

}
