package br.com.chocode.back.dao;

import br.com.chocode.back.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente, Long> {

}
