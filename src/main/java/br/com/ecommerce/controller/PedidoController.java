package br.com.ecommerce.controller;

import br.com.ecommerce.dto.PedidoCompletoDTO;
import br.com.ecommerce.models.DadosPedido;
import br.com.ecommerce.models.Pedido;
import br.com.ecommerce.service.pedido.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

    @Autowired
    IPedidoService service;

    @PostMapping("/checkout")
    public ResponseEntity<Pedido> novoPedido (@RequestBody PedidoCompletoDTO pedidoDTO){
        Pedido res = service.novoPedido(pedidoDTO);
        return ResponseEntity.ok(res);

    }
}
