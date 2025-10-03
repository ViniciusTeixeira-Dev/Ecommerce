package br.com.ecommerce.service.produto;

import br.com.ecommerce.dao.ProdutoDAO;
import br.com.ecommerce.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements IProdutoService{

    @Autowired
    private ProdutoDAO dao;

    @Override
    public Produto cadastrar(Produto novo) {
        novo.setIsAtivo(1);
        return dao.save(novo);
    }

    @Override
    public Produto alterar(Produto produto) {
        return dao.save(produto);
    }

    @Override
    public List<Produto> buscarPeloNome(String nome) {
        return dao.findByNomeContaining(nome);
    }


}
