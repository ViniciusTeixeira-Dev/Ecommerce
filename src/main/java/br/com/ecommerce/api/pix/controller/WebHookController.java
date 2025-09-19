package br.com.ecommerce.api.pix.controller;

import br.com.ecommerce.api.pix.service.WebHookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WebHookController {

        @Autowired
        WebHookService webHookService;

        @PostMapping("/webhook/**")
        public ResponseEntity<?> receberNotificacao(@RequestBody Map<String, Object> payLoad){
            System.out.println(payLoad);
            return ResponseEntity.ok().build();
        }

        @PutMapping("/webhook")
        public ResponseEntity<?> configurarWebhook(){
            boolean resultado = webHookService.configurarWebhook();

            if(resultado){
                return ResponseEntity.status(200).build();
            }
            else{
                return ResponseEntity.status(401).build();
            }

        }



}

