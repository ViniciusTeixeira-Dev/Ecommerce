package br.com.ecommerce.dto;

import java.util.List;

public class PedidoCompletoDTO {

    private String nomeDestinatario;
    private String cpfDestinatario;
    private String gmailDestinatario;
    private String telefoneDestinatario;
    private String cep;
    private String endereco;
    private String numeroEndereco;
    private String uf;
    private String cidade;
    private String complementoEndereco;
    private List<ItensPedidoDTO> itens;


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

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
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

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public List<ItensPedidoDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItensPedidoDTO> itens) {
        this.itens = itens;
    }
}