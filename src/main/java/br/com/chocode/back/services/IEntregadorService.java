package br.com.chocode.back.services;

import br.com.chocode.back.model.Entregador;
import br.com.chocode.back.security.Token;

import java.util.List;

public interface IEntregadorService {

	public Token gerarToken(Entregador entregador);

	public Entregador save(Entregador entregador);

	public List<Entregador> findAll();

	public Entregador findById(Long id);
}