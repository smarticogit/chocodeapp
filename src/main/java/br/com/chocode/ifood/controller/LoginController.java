package br.com.chocode.ifood.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class LoginController {

	//Seria interessanter manter o login no controller do entregador com o método que coloquei abaixo
	//e após a integração com o pacote segurança no final do projeto
	
//	@Autowired
//	private ILoginService service;
	
<<<<<<< HEAD:src/main/java/br/com/chocode/ifood/controller/LoginController.java
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody String email,String senha){
		System.out.printf("Front email -> ", email);
		System.out.printf("Front senha -> ", senha);
		return ResponseEntity.status(200).body("Mete Marcha");
	}
=======
//	@PostMapping("/login")
//	public ResponseEntity<String> login(@RequestBody String email, @RequestBody String senha){
		
//		return ResponseEntity.status(200).body("Acelera!");
//	}
>>>>>>> main:ifood/src/main/java/br/com/chocode/ifood/controller/LoginController.java
	
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
