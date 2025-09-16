package br.com.ecommerce.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.beans.ConstructorProperties;

@Entity
@Table(name = "tbl_dados_pedido")
public class DadosPedido {

    @Id
    @Column(name = "id_pedido")
    private Integer id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_pedido")
    @JsonBackReference
    private Pedido pedido;

    @Column(name = "nome_destinatario", length = 100)
    private String nome;

    @Column(name = "cpf_destinatario", length = 45)
    private String cpf;

    @Column(name = "gmail_destinatario", length = 45)
    private String gmail;

    @Column(name = "telefone_destinatario", length = 45)
    private String telefone;

    @Column(name = "cep", length = 45)
    private String cep;

    @Column(name = "endereco", length = 45)
    private String endereco;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "uf", length = 45)
    private String uf;

    @Column(name = "cidade", length = 45)
    private String cidade;

    @Column(name = "complemento", length = 45)
    private String complemento;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
