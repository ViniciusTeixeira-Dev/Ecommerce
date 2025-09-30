package br.com.ecommerce.service.pedido;

import br.com.ecommerce.dao.PedidoDAO;
import br.com.ecommerce.dto.PedidoCompletoDTO;
import br.com.ecommerce.models.DadosPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoImpl implements IPedidoService {

    @Autowired
    PedidoDAO dao;

    @Override
    public Pedido novoPedido(PedidoCompletoDTO dto) {
        Pedido pedido = new Pedido();
        pedido.setQuantidade(dto.getQuantidade());
        pedido.setValorVenda(dto.getValorVenda());
        pedido.setValorProducao(dto.getValorProducao());
        pedido.setValorTotal(dto.getValorVenda() * dto.getQuantidade());
        pedido.setData(dto.getData());
        pedido.setStatus(dto.getStatus());
        pedido.setNome(dto.getNomeProduto());

        DadosPedido dadosPedido = new DadosPedido();
        dadosPedido.setNome(dto.getNomeDestinatario());
        dadosPedido.setCpf(dto.getCpfDestinatario());
        dadosPedido.setGmail(dto.getGmailDestinatario());
        dadosPedido.setTelefone(dto.getTelefoneDestinatario());
        dadosPedido.setCep(dto.getCep());
        dadosPedido.setEndereco(dto.getEndereco());
        dadosPedido.setNumero(dto.getNumero());
        dadosPedido.setUf(dto.getUf());
        dadosPedido.setCidade(dto.getCidade());
        dadosPedido.setComplemento(dto.getComplemento());

        pedido.setDadosPedido(dadosPedido);
        dadosPedido.setPedido(pedido);

        return dao.save(pedido);
    }

}

