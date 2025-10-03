package br.com.ecommerce.dto;

import java.util.List;

public record PedidoCompletoDTO(
        DadosContatoDTO DadosContato,
        DadosEntregaDTO DadosEntrega,
        List<ItensPedidoDTO> itens
) {
}
