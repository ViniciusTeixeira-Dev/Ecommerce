package br.com.ecommerce.controller;

import br.com.ecommerce.models.Produto;
import br.com.ecommerce.service.produto.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    private IProdutoService service;

    @GetMapping("/gerenciamento")
    public ResponseEntity<List<Produto>> recuperarPeloNome(@RequestParam(name = "nome") String nome){
        List<Produto> produto = service.buscarPeloNome(nome);
        return ResponseEntity.ok(produto);
    }

    @PostMapping("/gerenciamento/novo")
    public ResponseEntity<Produto> cadastrarNovoProduto(@RequestBody Produto novo) throws Exception{
        Produto res = service.cadastrar(novo);

        if(res != null){
            return ResponseEntity.created(new URI("/gerenciamento/" + res.getId())).body(res);
        }

        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/gerenciamento/editar/{id}")
    public ResponseEntity<Produto> editarProduto(@RequestBody Produto produto,@PathVariable Integer id){
        if(produto.getId() == null){
            produto.setId(id);
        }
        Produto res = service.alterar(produto);
        if(res != null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/gerenciamento/remover/{id}")
    public ResponseEntity<Produto> excluirProduto(@PathVariable Integer id){
        boolean res = service.excluir(id);
        if(res){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
