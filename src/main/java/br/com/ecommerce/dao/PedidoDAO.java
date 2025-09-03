package br.com.ecommerce.dao;

import br.com.ecommerce.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidoDAO extends JpaRepository<Pedido, Integer> {
}
