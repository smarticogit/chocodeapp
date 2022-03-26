package br.com.chocode.back.services;

import br.com.chocode.back.model.Entregador;
import br.com.chocode.back.security.Token;

public interface IEntregadorService {

	public Token gerarToken(Entregador entregador);

	public Entregador findById(Long id);
}