package br.com.chocode.ifood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.chocode.ifood.dto.PedidoDTO;
import br.com.chocode.ifood.service.IPedidoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private IPedidoService service;
	
	@GetMapping("/findall")
	public ResponseEntity<List<PedidoDTO>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
}
