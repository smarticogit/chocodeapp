package br.com.chocode.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.chocode.back.model.Entregador;
import br.com.chocode.back.services.IEntregadorService;

@RestController
@CrossOrigin("*")
@RequestMapping("/entregador")
public class EntregadorController {
	
	@Autowired
	private IEntregadorService service;

	@GetMapping("/{id}")
	public ResponseEntity<Entregador> findById(@PathVariable Long id) {
		return ResponseEntity.status(200).body(service.findById(id));
	}
	
}
