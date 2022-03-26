package br.com.chocode.back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.chocode.back.dao.GeolocalizacaoDAO;

@Component
public class GeolocalizacaoServiceImpl implements IGeolocalizacaoService {

	@Autowired
	private GeolocalizacaoDAO dao;
	
//	private GeolocalizacaoDTO save(Long id);
	
	
}
