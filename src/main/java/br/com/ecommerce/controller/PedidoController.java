package br.com.ecommerce.controller;

import br.com.ecommerce.api.pix.service.PixService;
import br.com.ecommerce.api.pix.service.WebHookService;
import br.com.ecommerce.dto.PedidoCompletoDTO;
import br.com.ecommerce.models.Pedido;
import br.com.ecommerce.service.pedido.IPedidoService;
import org.json.JSONObject;
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

    @Autowired
    WebHookService webHookService;

    @PostMapping("/checkout")
    public ResponseEntity<String> novoPedido (@RequestBody PedidoCompletoDTO pedidoDTO){
        Pedido res = service.novoPedido(pedidoDTO);
        String qrCode = pixService.criarCobranca(pedidoDTO);
        webHookService.configurarWebhook();
        return ResponseEntity.ok(qrCode);

    }
}
