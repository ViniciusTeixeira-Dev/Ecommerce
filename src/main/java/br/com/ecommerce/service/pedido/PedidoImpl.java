package br.com.ecommerce.service.pedido;

import br.com.ecommerce.dao.PedidoDAO;
import br.com.ecommerce.dao.ProdutoDAO;
import br.com.ecommerce.dto.ItensPedidoDTO;
import br.com.ecommerce.dto.PedidoCompletoDTO;
import br.com.ecommerce.models.ItensPedido;
import br.com.ecommerce.models.Pedido;
import br.com.ecommerce.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PedidoImpl implements IPedidoService {

    @Autowired
    PedidoDAO dao;

    @Autowired
    ProdutoDAO produtoDAO;

    @Override
    public Pedido novoPedido(PedidoCompletoDTO dto) {

        Pedido pedido = new Pedido();
        pedido.setNomeDestinatario(dto.getNomeDestinatario());
        pedido.setCpfDestinatario(dto.getCpfDestinatario());
        pedido.setGmailDestinatario(dto.getGmailDestinatario());
        pedido.setTelefoneDestinatario(dto.getTelefoneDestinatario());
        pedido.setCep(dto.getCep());
        pedido.setLogradouro(dto.getEndereco());
        pedido.setNumeroEndereco(dto.getNumeroEndereco());
        pedido.setUf(dto.getUf());
        pedido.setCidade(dto.getCidade());
        pedido.setComplementoEndereco(dto.getComplementoEndereco());
        pedido.setData(String.valueOf(LocalDate.now()));
        pedido.setStatus("Aguardando Pagamento");


        List<ItensPedido> itensDoPedido = new ArrayList<>();
        double valorTotal = 0.0;

        for (ItensPedidoDTO itemDto : dto.getItens()) {
            Produto produto = produtoDAO.findById(itemDto.idProduto())
                    .orElseThrow(() -> new NoSuchElementException("Produto com ID " + itemDto.idProduto() + " não encontrado."));

            ItensPedido itemPedido = new ItensPedido();

            itemPedido.setQuantidade(itemDto.quantidade());
            itemPedido.setValorVenda(produto.getValorVenda());

            double subtotal = itemDto.quantidade() * produto.getValorVenda();
            itemPedido.setValorTotal(subtotal);

            itemPedido.setProduto(produto);
            itemPedido.setPedido(pedido);

            itensDoPedido.add(itemPedido);

            valorTotal += subtotal;
        }

        pedido.setItens(itensDoPedido);
        pedido.setValorTotal(valorTotal);
        return dao.save(pedido);
    }

}

