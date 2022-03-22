package br.com.chocode.ifood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.chocode.ifood.dao.EntregadorDAO;

@Component
public class EntregadorServiceImpl implements IEntregadorService{

	@Autowired
	private EntregadorDAO dao;
}
