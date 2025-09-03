package br.com.ecommerce.controller;

import br.com.ecommerce.dao.UsuarioDAO;
import br.com.ecommerce.dto.LoginDTO;
import br.com.ecommerce.models.Usuario;
import br.com.ecommerce.security.JWToken;
import br.com.ecommerce.service.usuario.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UsuarioDAO dao;

    @Autowired
    IUsuarioService service;


    @PostMapping("/registro")
    public ResponseEntity<Usuario> registrarNovoUsuario(@RequestBody Usuario novo){
        Usuario res = service.novoUsuario(novo);
        if(res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/login")
    public ResponseEntity<JWToken> realizarLogin(@RequestBody LoginDTO dadosLogin){
        JWToken token = service.login(dadosLogin);
        if(token != null){
            return ResponseEntity.ok(token);
        }
        return ResponseEntity.status(403).build();
    }
}
