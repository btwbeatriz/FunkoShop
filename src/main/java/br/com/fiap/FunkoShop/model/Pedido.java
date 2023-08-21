package br.com.fiap.FunkoShop.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

    private String nomeProduto;
    private BigDecimal valorNegociado;
    private LocalDate dataEntrega;
    private String urlProduto;
    private String urlImagem;
    private String urlImagem2;


    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Pedido setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        return this;
    }

    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    public Pedido setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
        return this;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public Pedido setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
        return this;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public Pedido setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
        return this;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public Pedido setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
        return this;
    }
    public String getUrlImagem2() {
        return urlImagem2;
    }

    public Pedido setUrlImagem2(String urlImagem2) {
        this.urlImagem2 = urlImagem2;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Pedido setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}
