package br.com.ecommerce.models;

import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="tbl_pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pedido")
    private Integer id_pedido;

    @Column(name="nome_destinatario", length = 100)
    private String nomeDestinatario;

    @Column(name="telefone_destinatario", length = 45)
    private String telefoneDestinatario;

    @Column(name="gmail_destinatario", length = 100)
    private String gmailDestinatario;

    @Column(name="cpf_destinatario", length = 45)
    private String cpfDestinatario;

    @Column(name="cep_destinatario", length = 45)
    private String cepDestinatario;

    @Column(name="endereco_destinatario", length = 45)
    private String enderecoDestinatario;

    @Column(name="numero_endereco", length = 45)
    private String numeroEndereco;

    @Column(name="uf_destinatario", length = 2)
    private String ufDestinatario;

    @Column(name="cidade_destinatario", length = 45)
    private String cidadeDestinatario;

    @Column(name="complemento_endereco", length = 45, nullable = true)
    private String complementoEndereco;

    @Column(name="data_pedido")
    private String data;

    @Column(name="status_pedido", length = 45)
    private String status;

    @Column(name="valor_total_pedido")
    private Double valorTotal;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<ItensPedido> itens;


    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public String getTelefoneDestinatario() {
        return telefoneDestinatario;
    }

    public void setTelefoneDestinatario(String telefoneDestinatario) {
        this.telefoneDestinatario = telefoneDestinatario;
    }

    public String getGmailDestinatario() {
        return gmailDestinatario;
    }

    public void setGmailDestinatario(String gmailDestinatario) {
        this.gmailDestinatario = gmailDestinatario;
    }

    public String getCpfDestinatario() {
        return cpfDestinatario;
    }

    public void setCpfDestinatario(String cpfDestinatario) {
        this.cpfDestinatario = cpfDestinatario;
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

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItensPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItensPedido> itens) {
        this.itens = itens;
    }
}