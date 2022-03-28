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
	public ResponseEntity<GeolocalizacaoDTO> save(@RequestBody GeolocalizacaoDTO geolocalizacaoDTO) {
		GeolocalizacaoDTO geolocalizacao = service.save(geolocalizacaoDTO);
		if (geolocalizacao == null) {
			return ResponseEntity.status(404).body(null);
		}
		return ResponseEntity.status(201).body(geolocalizacao);
	}

	@GetMapping("/listar")
	public ResponseEntity<List<GeolocalizacaoDTO>> findAll() {
		return ResponseEntity.status(200).body(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Geolocalizacao> findById(@PathVariable Long id) {
		return ResponseEntity.status(200).body(service.findById(id));
	}

	@GetMapping("/pedido/{id}")
	public ResponseEntity<List<GeolocalizacaoDTO>> findAllGeo(@PathVariable Long id) {
		return ResponseEntity.status(200).body(service.findByPedidoId(id));
	}

}
