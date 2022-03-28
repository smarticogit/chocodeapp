package br.com.chocode.back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.chocode.back.dao.EntregadorDAO;
import br.com.chocode.back.model.Entregador;
import br.com.chocode.back.security.Token;
import br.com.chocode.back.security.TokenUtil;

import java.util.List;

@Component
public class EntregadorServiceImpl implements IEntregadorService {

	@Autowired
	private EntregadorDAO dao;

	@Override
	public Token gerarTokenDeUsuarioLogado(Entregador dadosLogin) {
		Entregador user = dao.findByEmail(dadosLogin.getEmail());
		try {

			if (user != null) { 
				String senhaLogin = dadosLogin.getSenha();

				System.out.println("Senha login = " + senhaLogin);
				System.out.println("Senha user  = " + user.getSenha());

				if (senhaLogin.equals(user.getSenha())) {
					return new Token(TokenUtil.createToken(user), user.getId());
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

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
