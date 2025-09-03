package br.com.ecommerce.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name="tbl_pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pedido")
    private Integer id_pedido;

    @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
    @JsonManagedReference
    private DadosPedido dadosPedido;

    @Column(name="quantidade_produto")
    private Integer quantidade;

    @Column(name="valor_venda_produto")
    private Double valorVenda;

    @Column(name="valor_producao_produto")
    private Double valorProducao;

    @Column(name="data_pedido", length = 45)
    private String data;

    @Column(name="status_pedido", length = 45)
    private String status;

    @Column(name="nome_produto", length = 45)
    private String nome;




    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public DadosPedido getDadosPedido() {
        return dadosPedido;
    }

    public void setDadosPedido(DadosPedido dadosPedido) {
        this.dadosPedido = dadosPedido;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
