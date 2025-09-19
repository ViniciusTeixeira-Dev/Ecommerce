package br.com.ecommerce.api.pix.service;

import br.com.ecommerce.api.pix.PixConfig;
import br.com.efi.efisdk.EfiPay;
import br.com.efi.efisdk.exceptions.EfiPayException;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import org.json.JSONObject;


@Service
public class WebHookService {

    @Value("${pix.chave}")
    private String chavePix;

    private final HashMap<String, Object> configuracoes = new HashMap<String, Object>();

    public WebHookService(final PixConfig pixConfig){
        this.configuracoes.put("client_id", pixConfig.clientId());
        this.configuracoes.put("client_secret", pixConfig.clientSecret());
        this.configuracoes.put("certificate", pixConfig.certificatePath());
        this.configuracoes.put("sandbox", pixConfig.sandbox());
        this.configuracoes.put("debug", pixConfig.debug());
        this.configuracoes.put("x-skip-mtls-checking", "true");
    }

    public boolean configurarWebhook() {

        HashMap<String, String> params = new HashMap<String, String>();
        params.put("chave", chavePix);

        JSONObject body = new JSONObject();
        body.put("webhookUrl", "https://1a47f9e58923.ngrok-free.app/webhook");

        String operacao = "pixConfigWebhook";

        JSONObject response =  executarOperacao(operacao, params, body);

        return response != null;
    }


    private JSONObject executarOperacao(String operacao, HashMap<String, String> params, JSONObject body) {
        try{
            EfiPay efi = new EfiPay(configuracoes);
            JSONObject response = efi.call(operacao, params, body);
            System.out.println("resposta" + response);
            return response;
        } catch(EfiPayException e){
            System.out.println(e.getError());
            System.out.println(e.getErrorDescription());
        } catch(UnsupportedOperationException | JSONException e){
            System.out.println("Invalid JSON format {}" + e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
