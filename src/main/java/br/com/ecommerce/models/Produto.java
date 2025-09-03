package br.com.ecommerce.models;

import jakarta.persistence.*;


@Entity
@Table(name="tbl_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_produto")
    private Integer id;

    @Column(name="nome_produto", length = 45)
    private String nome;

    @Column(name="valor_venda_produto")
    private Double valorVenda;

    @Column(name="valor_producao_produto")
    private Double valorProducao;

    @Column(name="estoque_produto", length = 45)
    private Integer estoque;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
