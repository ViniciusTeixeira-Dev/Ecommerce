package br.com.ecommerce.dao;

import br.com.ecommerce.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
    public Usuario findByLogin(String username);
}
