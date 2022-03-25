package br.com.chocode.back.services;


import br.com.chocode.back.model.Entregador;

public interface IEntregadorService {
	
	public Entregador findById(Long id);
}