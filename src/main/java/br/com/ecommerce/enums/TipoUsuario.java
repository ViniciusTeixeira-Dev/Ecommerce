package br.com.ecommerce.enums;

public enum TipoUsuario {
    USUARIO(0),
    ADMIN(1);

    private final int value;

    TipoUsuario(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
