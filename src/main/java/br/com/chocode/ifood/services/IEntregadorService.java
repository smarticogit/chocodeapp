package br.com.chocode.ifood.services;

import br.com.chocode.ifood.model.Entregador;

public interface IEntregadorService {
	
	public Entregador findById(Long id);
}