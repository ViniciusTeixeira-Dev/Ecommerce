package br.com.ecommerce.enums;

public enum Links {
        NGROK_TUNNEL("https://97b2b3b64e15.ngrok-free.app");

    private final String url;

    Links(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
