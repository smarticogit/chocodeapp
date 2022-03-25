package br.com.chocode.ifood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")
public class GeolocalizacaoController {
	
//	@Autowired
//	private IGeolocalizacaoServiceImpl service;
	
	@GetMapping("/pedido/{id}/geolocalizacao")
	public String texto () {
		return "ok";
	}
	
	@PostMapping("/pedido/{id}/geolocalizacao")
	public String texto2 () {
		return "ok";
	}

}
