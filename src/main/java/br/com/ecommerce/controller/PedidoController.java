package br.com.ecommerce.controller;

import br.com.ecommerce.api.pix.PixService;
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

    @Autowired
    PixService pixService;

    @PostMapping("/checkout")
    public ResponseEntity<String> novoPedido (@RequestBody PedidoCompletoDTO pedidoDTO){
        Pedido res = service.novoPedido(pedidoDTO);
        String qrCode = pixService.criarQrCode(pedidoDTO);
        return ResponseEntity.ok(qrCode);

    }
}
