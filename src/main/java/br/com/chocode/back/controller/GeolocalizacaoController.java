package br.com.chocode.back.controller;

import br.com.chocode.back.DTO.GeolocalizacaoDTO;
import br.com.chocode.back.model.Geolocalizacao;
import br.com.chocode.back.services.IGeolocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/geolocalizacao")
public class GeolocalizacaoController {
	
	@Autowired
	private IGeolocalizacaoService service;

	@PostMapping
	public ResponseEntity<Geolocalizacao> save(@RequestBody GeolocalizacaoDTO geolocalizacaoDTO) {
		Geolocalizacao geolocalizacao = service.save(geolocalizacaoDTO);
		if (geolocalizacao == null) {
			return ResponseEntity.status(404).body(geolocalizacao);
		}
		return ResponseEntity.status(201).body(geolocalizacao);
	}

	@GetMapping("/listar")
	public ResponseEntity<List<Geolocalizacao>> findAll() {
		return ResponseEntity.status(200).body(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Geolocalizacao> findById(@PathVariable Long id) {
		return ResponseEntity.status(200).body(service.findById(id));
	}

	@GetMapping("/pedido/{id}/geolocalizacao")
	public String texto () {
		return "ok";
	}
	
	@PostMapping("/pedido/{id}/geolocalizacao")
	public String texto2 () {
		return "ok";
	}

}
