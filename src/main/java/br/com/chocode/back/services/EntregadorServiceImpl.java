package br.com.chocode.back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.chocode.back.dao.EntregadorDAO;
import br.com.chocode.back.model.Entregador;
import br.com.chocode.back.security.Token;

import java.util.List;

@Component
public class EntregadorServiceImpl implements IEntregadorService {

	@Autowired
	private EntregadorDAO dao;

	public Token gerarToken(Entregador entregador) {
		return null;
	}

	@Override
	public Entregador save(Entregador entregador) {
		return dao.saveAndFlush(entregador);
	}

	@Override
	public List<Entregador> findAll() {
		List<Entregador> listaEntredadores = dao.findAll();
		return listaEntredadores;
	}

	public Entregador findById(Long id) {
		return dao.findById(id).get();
	}
}
