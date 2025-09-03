package br.com.ecommerce.service.pedido;

import br.com.ecommerce.dao.PedidoDAO;
import br.com.ecommerce.dto.PedidoCompletoDTO;
import br.com.ecommerce.models.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoImpl implements IPedidoService {

    @Autowired
    PedidoDAO dao;

    @Override
    public Pedido novoPedido(PedidoCompletoDTO dto) {
        Pedido novoPedido = dto.toPedido();

        return dao.save(novoPedido);
    }

}

