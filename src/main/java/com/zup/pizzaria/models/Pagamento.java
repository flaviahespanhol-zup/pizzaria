package com.zup.pizzaria.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pedidoId;
    private String formaPagamento;
    private double valorTotalPedido;
    private double valorPago;
    private LocalDate dataHoraPagamento;

    public Pagamento(Long pedidoId, String formaPagamento, double valorTotalPedido) {
        this.pedidoId = pedidoId;
        this.formaPagamento = formaPagamento;
        this.valorTotalPedido = valorTotalPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void validarPagamento() throws Exception {
        if (getValorPago() < getValorTotalPedido()) {
            throw new Exception();
        }
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public LocalDate getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(LocalDate dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

}
