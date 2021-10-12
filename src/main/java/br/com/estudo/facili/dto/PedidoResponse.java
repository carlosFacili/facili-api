package br.com.estudo.facili.dto;

import br.com.estudo.facili.entity.Pedido;

import java.time.LocalDateTime;

public class PedidoResponse {

    private String codigo;

    private String data_criacao;

    private String produto;

    private String status;

    private String notas;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public static PedidoResponse converterParaDto(Pedido entidade) {
        PedidoResponse response = new PedidoResponse();

        response.setCodigo(entidade.getCodigo());
        response.setProduto(entidade.getProduto());
        response.setData_criacao(entidade.getData_criacao().toString());

        return response;
    }

}
