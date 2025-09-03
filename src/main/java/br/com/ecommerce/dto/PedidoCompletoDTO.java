package br.com.ecommerce.dto;

import br.com.ecommerce.models.DadosPedido;
import br.com.ecommerce.models.Pedido;

public class PedidoCompletoDTO {

    // Campos do Pedido
    private Integer quantidade;
    private Double valorVenda;
    private Double valorProducao;
    private String data;
    private String status;
    private String nomeProduto;

    // Campos de DadosPedido
    private String nomeDestinatario;
    private String cpfDestinatario;
    private String gmailDestinatario;
    private String telefoneDestinatario;
    private String cep;
    private String endereco;
    private Integer numero;
    private String uf;
    private String cidade;
    private String complemento;


    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setQuantidade(this.getQuantidade());
        pedido.setValorVenda(this.getValorVenda());
        pedido.setValorProducao(this.getValorProducao());
        pedido.setData(this.getData());
        pedido.setStatus(this.getStatus());
        pedido.setNome(this.getNomeProduto());

        DadosPedido dadosPedido = new DadosPedido();
        dadosPedido.setNome(this.getNomeDestinatario());
        dadosPedido.setCpf(this.getCpfDestinatario());
        dadosPedido.setGmail(this.getGmailDestinatario());
        dadosPedido.setTelefone(this.getTelefoneDestinatario());
        dadosPedido.setCep(this.getCep());
        dadosPedido.setEndereco(this.getEndereco());
        dadosPedido.setNumero(this.getNumero());
        dadosPedido.setUf(this.getUf());
        dadosPedido.setCidade(this.getCidade());
        dadosPedido.setComplemento(this.getComplemento());

        pedido.setDadosPedido(dadosPedido);
        dadosPedido.setPedido(pedido);

        return pedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(Double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public String getCpfDestinatario() {
        return cpfDestinatario;
    }

    public void setCpfDestinatario(String cpfDestinatario) {
        this.cpfDestinatario = cpfDestinatario;
    }

    public String getGmailDestinatario() {
        return gmailDestinatario;
    }

    public void setGmailDestinatario(String gmailDestinatario) {
        this.gmailDestinatario = gmailDestinatario;
    }

    public String getTelefoneDestinatario() {
        return telefoneDestinatario;
    }

    public void setTelefoneDestinatario(String telefoneDestinatario) {
        this.telefoneDestinatario = telefoneDestinatario;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}