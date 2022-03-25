package br.com.chocode.ifood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.chocode.ifood.model.Pedido;
import br.com.chocode.ifood.services.IPedidoService;

@RestController
@CrossOrigin("*")
public class PedidoController {

	@Autowired
	private IPedidoService service;

	@GetMapping("/pedidos")
	public ResponseEntity<List<Pedido>> findAll() {
		return ResponseEntity.status(200).body(service.findAll());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Long id) {
		return ResponseEntity.status(200).body(service.findById(id));
	}

//	@PutMapping("/pedido/{id}/status/")
//	public ResponseEntity<Pedido> updateStatus(@PathVariable Long id, @RequestBody String status) {
//		return ResponseEntity.ok(service.updateStatus(id, status));
//	}
	
	
	@PostMapping("/pedido/{id_pedido}/entregador/{id_entregador}")
	public String texto3 () {
		return "ok";
	}
	
}
