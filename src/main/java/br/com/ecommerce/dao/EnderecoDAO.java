package br.com.ecommerce.dao;

import br.com.ecommerce.models.EnderecosUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoDAO extends JpaRepository<EnderecosUsuario, Integer> {
}
