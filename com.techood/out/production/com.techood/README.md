# TechFood ERP - Refatoração com SOLID

- Aluna: Amanda Salvador
- UC: Arquitetura de Sistemas
- Docente: Lucas Souza dos Santos
- Data: 19/03/2026

## Descrição

Prova de Arquitetura de Sistemas onde o objetivo era transformar o sistema em uma arquitetura modular, orientada a objetos e desacoplada, aplicando os princípios SOLID e boas práticas de Clean Code.

---

## Melhorias Implementadas

### Separação de Camadas

O sistema foi organizado em pacotes:

- `model` -- Entidades do sistema (Funcionario, Prato, Pedido)
- `service` -- Regras de negócio (Pedido, Estoque, Cardápio)
- `financeiro` -- Estratégias de pagamento
- `delivery` -- Estratégias de frete
- `rh` -- Gestão de funcionários
- `app` -- Classe principal (Main)

---

## Aplicação dos Princípios SOLID

### Cada classe possui uma única responsabilidade:

- `Funcionario` -- dados do funcionário
- `Prato` -- dados do produto
- `CardapioService` -- gerenciamento do cardápio
- `PedidoService` -- processamento de vendas
- `EstoqueService` -- controle de estoque

---

### O sistema está aberto para extensão e fechado para modificação.

Pagamentos:

- Interface `MetodoPagamento`
- Implementações:
    - `PixPagamento`
    - `CreditoPagamento`
    - `EspeciePagamento`

Frete:

- Interface `FreteStrategy`
- Implementações:
    - `FreteFixo`
    - `FreteGratis`

Novos métodos podem ser adicionados sem alterar código existente.

---

### As implementações podem ser substituídas sem quebrar o sistema:

```java
MetodoPagamento pagamento = new PixPagamento();
```

---


