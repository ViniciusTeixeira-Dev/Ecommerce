package br.com.ecommerce.service.pedido;

import br.com.ecommerce.dto.PedidoCompletoDTO;
import br.com.ecommerce.models.DadosPedido;

public interface IPedidoService {

    public Pedido novoPedido (PedidoCompletoDTO dto);
}
