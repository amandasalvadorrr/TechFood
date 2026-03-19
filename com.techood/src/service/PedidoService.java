package service;

import model.Pedido;
import financeiro.MetodoPagamento;
import delivery.FreteStrategy;

public class PedidoService {

    private EstoqueService estoqueService;

    public PedidoService(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    public double realizarPedido(Pedido pedido,
                                 MetodoPagamento pagamento,
                                 FreteStrategy frete) {

        if (!estoqueService.verificarEstoque(
                pedido.getPrato(),
                pedido.getQuantidade())) {
            throw new RuntimeException("Estoque insuficiente!");
        }

        double valorBase = pedido.getPrato().getPreco() * pedido.getQuantidade();

        valorBase = frete.calcularFrete(valorBase);
        double valorFinal = pagamento.calcular(valorBase);

        estoqueService.darBaixa(pedido.getPrato(), pedido.getQuantidade());

        return valorFinal;
    }
}