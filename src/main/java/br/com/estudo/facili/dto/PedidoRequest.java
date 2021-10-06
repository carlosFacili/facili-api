package br.com.estudo.facili.dto;

import br.com.estudo.facili.entity.Pedido;

import java.time.LocalDateTime;

public class PedidoRequest {

    private String codigo;

    private LocalDateTime data_criacao;

    private String produto;

    private String status;

    private String notas;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
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


    public static Pedido converteParaEntidade(PedidoRequest pedido) {
        Pedido entidade = new Pedido();
        entidade.setCodigo(pedido.getCodigo());
        entidade.setData_criacao(LocalDateTime.now());
        entidade.setStatus(pedido.getStatus());
        entidade.setNotas(pedido.getNotas());

        return entidade;
    }
}
