package br.com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidoDAO extends JpaRepository<Pedido, Integer> {
}
