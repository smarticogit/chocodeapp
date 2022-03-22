package br.com.chocode.ifood.teste;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.chocode.ifood.dao.ClienteDAO;
import br.com.chocode.ifood.dao.PedidoDAO;
import br.com.chocode.ifood.model.Cliente;
import br.com.chocode.ifood.model.Pedido;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private ClienteDAO clienteDao;

	@Autowired
	private PedidoDAO pedidoDao;

	@Override
	public void run(String... args) throws Exception {

		Cliente c1 = new Cliente(null, "Jose", "Rua Um", "123", "456");
		Cliente c2 = new Cliente(null, "Maria", "Rua Dois", "123", "456");
		Cliente c3 = new Cliente(null, "Fulano", "Rua Cinco", "123", "456");

		clienteDao.saveAll(Arrays.asList(c1, c2, c3));

//		Pedido p1 = new Pedido(null, "Aguarda Entrega", "Restaurante Um", c1);
//		Pedido p2 = new Pedido(null, "Aguarda Entrega", "Restaurante Dois", c2);
//		Pedido p3 = new Pedido(null, "Aguarda Entrega", "Restaurante Tres", c3);
//
//		pedidoDao.saveAll(Arrays.asList(p1, p2, p3));
	}
}
