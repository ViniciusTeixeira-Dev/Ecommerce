package br.com.ecommerce.dto;

import java.util.List;

public class PedidoCompletoDTO {


    private Integer idPedido;
    private Double valorTotalPedido;
    private String data;
    private String status;
    private String nomeDestinatario;
    private String cpfDestinatario;
    private String gmailDestinatario;
    private String telefoneDestinatario;
    private String cepDestinatario;
    private String enderecoDestinatario;
    private String numeroEndereco;
    private String ufDestinatario;
    private String cidadeDestinatario;
    private String complementoEndereco;
    private List<ItensPedidoDTO> itens;


    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Double getValorTotalPedido() {
        if (itens == null) {
            return 0.0;
        }
        return itens.stream()
                .mapToDouble(ItensPedidoDTO::getValorTotalItem)
                .sum();
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

    public String getCepDestinatario() {
        return cepDestinatario;
    }

    public void setCepDestinatario(String cepDestinatario) {
        this.cepDestinatario = cepDestinatario;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getUfDestinatario() {
        return ufDestinatario;
    }

    public void setUfDestinatario(String ufDestinatario) {
        this.ufDestinatario = ufDestinatario;
    }

    public String getCidadeDestinatario() {
        return cidadeDestinatario;
    }

    public void setCidadeDestinatario(String cidadeDestinatario) {
        this.cidadeDestinatario = cidadeDestinatario;
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