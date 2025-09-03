package br.com.ecommerce.dao;

import br.com.ecommerce.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoDAO extends JpaRepository<Produto, Integer> {
    public List<Produto> findByNomeContaining(String palavraChave);
}
