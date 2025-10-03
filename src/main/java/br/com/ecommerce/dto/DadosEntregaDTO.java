package br.com.ecommerce.dto;

public record DadosEntregaDTO(
        String cep,
        String logradouro,
        String numero,
        String uf,
        String cidade,
        String complemento
) {
}
