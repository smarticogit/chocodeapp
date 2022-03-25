package br.com.chocode.back.services;

import antlr.Token;
import br.com.chocode.back.dao.EntregadorDAO;
import br.com.chocode.back.model.Entregador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
