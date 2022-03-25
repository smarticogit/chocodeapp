package br.com.chocode.ifood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import antlr.Token;
import br.com.chocode.ifood.dao.EntregadorDAO;
import br.com.chocode.ifood.model.Entregador;

@Component
public class EntregadorServiceImpl implements IEntregadorService{

	@Autowired
	private EntregadorDAO dao;
	
	public Token gerarToken(Entregador entregador) {
		return null;
		
	}
	
	public Entregador findById(Long id) {
		return dao.findById(id).get();
	}
}
