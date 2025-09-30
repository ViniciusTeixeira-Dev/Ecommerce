package br.com.ecommerce.dto;

public class ItensPedidoDTO {

    private Integer idProduto;
    private String nomeProduto;
    private Integer quantidade;
    private Double valorUnitarioVenda;
    private Double valorTotalItem;








    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitarioVenda() {
        return valorUnitarioVenda;
    }

    public void setValorUnitarioVenda(Double valorUnitarioVenda) {
        this.valorUnitarioVenda = valorUnitarioVenda;
    }

    public Double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(Double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }
}