package br.com.ecommerce.service.usuario;

import br.com.ecommerce.dao.UsuarioDAO;
import br.com.ecommerce.dto.LoginDTO;
import br.com.ecommerce.models.Usuario;
import br.com.ecommerce.security.JWToken;
import br.com.ecommerce.security.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    UsuarioDAO dao;

    @Autowired
    TokenUtil tokenUtil;

    @Override
    public Usuario novoUsuario(Usuario usuario) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String novaSenha = encoder.encode(usuario.getSenha());
        usuario.setSenha(novaSenha);
        return dao.save(usuario);
    }

    @Override
    public JWToken login(LoginDTO dto) {
        Usuario res = dao.findByLogin(dto.login());

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder.matches(dto.senha(), res.getSenha())){
            return tokenUtil.encode(res);
        }
        return null;
    }
}
