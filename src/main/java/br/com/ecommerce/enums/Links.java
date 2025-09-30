package br.com.ecommerce.enums;

public enum Links {
        NGROK_TUNNEL("https://a650a1286d95.ngrok-free.app");

    private final String url;

    Links(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
