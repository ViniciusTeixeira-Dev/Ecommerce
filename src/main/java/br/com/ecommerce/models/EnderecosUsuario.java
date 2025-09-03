package br.com.ecommerce.models;


import jakarta.persistence.*;

@Entity
@Table(name = "tbl_enderecos_usuario")
public class EnderecosUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario id_usuario;

    @Column(name="cep", length = 45)
    private String cep;

    @Column(name="endereco", length = 45)
    private String endereco;

    @Column(name="complemento", length = 45)
    private String complemento;

    @Column(name="uf", length = 45)
    private String uf;

    @Column(name="numero")
    private Integer numero;

    @Column(name="cidade", length = 45)
    private String cidade;




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
