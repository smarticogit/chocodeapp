package br.com.chocode.back.services;

import br.com.chocode.back.DTO.GeolocalizacaoDTO;
import br.com.chocode.back.model.Geolocalizacao;

import java.util.List;

public interface IGeolocalizacaoService {
    public Geolocalizacao save(GeolocalizacaoDTO geolocalizacaoDTO);

    public List<Geolocalizacao> findAll();

    public Geolocalizacao findById(Long id);

}
