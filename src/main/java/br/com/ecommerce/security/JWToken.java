package br.com.ecommerce.security;

public class JWToken {

    private String token;

    public JWToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
