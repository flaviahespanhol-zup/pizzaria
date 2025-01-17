# Pizzaria - Sistema de Gerenciamento

Este projeto é um sistema simples de gerenciamento de pedidos de uma pizzaria.

## Estrutura do Projeto

O sistema é composto pelas seguintes entidades:

- 
  Cliente: Representa os dados do cliente, como nome e e-mail.
- 
  Pedido: Representa um pedido feito por um cliente, contendo informações como descrição do pedido, e o id do cliente que fez o pedido.
- 
  Pagamento: Representa o pagamento de um pedido.

## Diagrama UML

Abaixo está o diagrama UML que representa as classes `Cliente`, `Pedido` e `Pagamento`:

```plantuml
    class Cliente {
        - Long id
        - String nome
        - String email
        + getId(): Long
        + setId(id: Long): void
        + getNome(): String
        + setNome(nome: String): void 
        + getEmail(): String
        + setEmail(email: String): void
    }

    class Pedido {
        - Long id
        - String descricao
        - Long clienteId
        + getId(): Long
        + setId(id: Long): void
        + getDescricao(): String
        + setDescricao(descricao: String): void
        + getClienteId(): Long
        + setClienteId(id: Long): void
    }

    class Pagamento {
        - Long id
        - Long pedidoId
        - String formaPagamento
        - double valorTotalPedido
        - double valorPago
        - LocalDate dataHoraPagamento
        + getId(): double
        + setId(): void
        + getPedidoId(): Long
        + setPedidoId(id: Long): void
        + getFormaPagamento(): String
        + setFormaPagamento(formaPagamento: String): void
        + getValorTotalPedido(): double
        + setValorTotalPedido(valorTotalPedido: double): void
        + getValorPago(): double
        + setValorPago(valorPago: double): void
        + getDataHoraPagamento(): double
        + validarPagamento(): void
        
    }
```

## Relacionamentos entre as Classes

- **
  Cliente tem uma relação de 1 para N com Pedido
  **: Um cliente pode fazer vários pedidos.
- **
  Pedido tem uma relação de 1 para 1 com Cliente
  **: Um pedido pode ser feito por apenas 1 cliente.
- **
  Pedido tem uma relação de 1 para 1 com Pagamento
  **: Um pedido tem exatamente um pagamento.

Representação no diagrama UML:

`````md
Cliente "1" --> "N" Pedido
Pedido "1" --> "1" Cliente
Pedido "1" --> "1" Pagamento
