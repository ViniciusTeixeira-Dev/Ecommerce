package br.com.ecommerce.service.produto;

import br.com.ecommerce.models.Produto;

import java.util.List;

public interface IProdutoService {

    public Produto cadastrar(Produto novo);
    public Produto alterar(Produto produto);
    public List<Produto> buscarPeloNome(String nome);
}
