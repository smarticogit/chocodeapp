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
	
	@Autowired
	private ILoginService service;
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody String email, @RequestBody String senha){
		
		return ResponseEntity.status(200).body("Acelera!");
	}
	
	

}