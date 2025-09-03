package br.com.ecommerce.service.usuario;

import br.com.ecommerce.dto.LoginDTO;
import br.com.ecommerce.models.Usuario;
import br.com.ecommerce.security.JWToken;

public interface IUsuarioService {

    public Usuario novoUsuario(Usuario usuario);
    public JWToken login(LoginDTO dto);
}
