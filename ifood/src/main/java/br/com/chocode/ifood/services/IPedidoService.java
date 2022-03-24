package br.com.chocode.ifood.services;

import java.util.List;

import br.com.chocode.ifood.dto.PedidoDTO;

public interface IPedidoService {

	public List<PedidoDTO> findAll();

	public PedidoDTO updateStatus(Long id, String status);
}
