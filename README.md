# TechFood ERP - Refatoração com SOLID

- Aluna: Amanda Salvador
- UC: Arquitetura de Sistemas
- Docente: Lucas Souza dos Santos
- Data: 19/03/2026

## Descrição

Prova de Arquitetura de Sistemas onde o objetivo era transformar o sistema em uma arquitetura modular, orientada a objetos e desacoplada, aplicando os princípios SOLID e boas práticas de Clean Code.

---

## Estrutura

- model: classes de domínio (Funcionario, Prato, Pedido)
- service: regras de negócio
- financeiro: pagamentos
- delivery: frete
- rh: funcionários
- app: menu
- main: execução do sistema

## Funcionalidades

- Listar pratos
- Cadastrar pratos
- Realizar vendas
- Controle de estoque
- Pagamento (Pix, Crédito, Espécie)
- Frete (fixo e grátis)

## SOLID

- SRP: classes com responsabilidade única
- OCP: novos pagamentos e fretes podem ser adicionados
- LSP: implementações podem ser substituídas
- ISP: interfaces específicas
- DIP: uso de interfaces e factories
