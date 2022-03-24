package br.com.chocode.ifood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.chocode.ifood.services.ILoginService;

@RestController
@CrossOrigin("*")
public class LoginController {

	//Seria interessanter manter o login no controller do entregador com o método que coloquei abaixo
	//e após a integração com o pacote segurança no final do projeto
	
//	@Autowired
//	private ILoginService service;
	
//	@PostMapping("/login")
//	public ResponseEntity<String> login(@RequestBody String email, @RequestBody String senha){
		
//		return ResponseEntity.status(200).body("Acelera!");
//	}
	
//	@Autowired
//	private IEntregadorService service;

//	@PostMapping("/login")
//	public ResponseEntity<Token> realizarLogin(@RequestBody EntregadorDTO dadosLogin) {
//		Token token = service.gerarTokenDeUsuarioLogado(dadosLogin);
//		if (token != null) {
//			return ResponseEntity.ok(token);
//		}
//		return ResponseEntity.status(401).build();
//	}
	

}
