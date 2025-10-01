package br.com.ecommerce.models;


import br.com.ecommerce.enums.TipoUsuario;
import jakarta.persistence.*;

@Entity
@Table(name="tbl_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer id;

    @Column(name="login_usuario", length = 45)
    private String login;

    @Column(name="senha_usuario", length = 250)
    private String senha;

    @Column(name="gmail_usuario", length = 45)
    private String gmail;

    @Column(name="is_admin")
    @Enumerated(EnumType.ORDINAL)
    private TipoUsuario tipo = TipoUsuario.USUARIO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
}
