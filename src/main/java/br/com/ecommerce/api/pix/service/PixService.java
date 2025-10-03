package br.com.ecommerce.api.pix.service;

import br.com.ecommerce.api.pix.PixConfig;
import br.com.ecommerce.models.Pedido;
import br.com.efi.efisdk.EfiPay;
import br.com.efi.efisdk.exceptions.EfiPayException;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;

@Service
public class PixService {

    @Value("${pix.chave}")
    private String chavePix;

    private final HashMap<String, Object> configuracoes = new HashMap<String, Object>();

    public PixService(final PixConfig pixConfig){
        this.configuracoes.put("client_id", pixConfig.clientId());
        this.configuracoes.put("client_secret", pixConfig.clientSecret());
        this.configuracoes.put("certificate", pixConfig.certificatePath());
        this.configuracoes.put("sandbox", pixConfig.sandbox());
        this.configuracoes.put("debug", pixConfig.debug());
    }

    public String criarCobranca(Pedido pedido){
        JSONObject body = new JSONObject();

        JSONObject calendario = new JSONObject();
        calendario.put("expiracao", 3600);
        body.put("calendario", calendario);

        JSONObject devedor = new JSONObject();
        devedor.put("cpf", pedido.getCpf());
        devedor.put("nome", pedido.getNome());
        body.put("devedor", devedor);

        JSONObject valor = new JSONObject();
        DecimalFormat df = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.US));
        double valorTotal = pedido.getValorTotal();
        String valorFormatado = df.format(valorTotal);
        valor.put("original", valorFormatado);
        body.put("valor", valor);

        body.put("chave", chavePix);
        body.put("solicitacaoPagador", "Pedido em loja de ecommerce");

        JSONObject res = executarOperacao("pixCreateImmediateCharge", body);

        if (res != null) {
            return res.toString(4);

        } else {
            return null;
        }
    }


    private JSONObject executarOperacao(String operacao, JSONObject body) {
        try{
            EfiPay efi = new EfiPay(configuracoes);
            JSONObject response = efi.call(operacao, new HashMap<String,String>(), body);
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
