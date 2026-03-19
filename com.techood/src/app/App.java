package app;

import model.*;
import service.*;
import financeiro.*;
import delivery.*;

import java.util.Scanner;

public class App {

    private Scanner sc = new Scanner(System.in);

    private CardapioService cardapioService = new CardapioService();
    private EstoqueService estoqueService = new EstoqueService();
    private PedidoService pedidoService = new PedidoService(estoqueService);

    public void iniciar() {
        cardapioService.carregarDadosIniciais();

        int op;

        do {
            System.out.println("\n1 - Listar pratos");
            System.out.println("2 - Realizar venda");
            System.out.println("3 - Cadastrar prato");
            System.out.println("0 - Sair");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    cardapioService.listarPratos();
                    break;
                case 2:
                    realizarVenda();
                    break;
                case 3:
                    cadastrarPrato();
                    break;
            }

        } while (op != 0);
    }

    private void realizarVenda() {
        cardapioService.listarPratos();

        System.out.print("Escolha o prato: ");
        int p = sc.nextInt();

        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();

        Prato prato = cardapioService.buscarPorIndice(p);
        Pedido pedido = new Pedido(prato, qtd);

        System.out.println("Pagamento: 1-Pix | 2-Crédito | 3-Espécie");
        MetodoPagamento pagamento = PagamentoFactory.criar(sc.nextInt());

        System.out.println("Entrega: 1-Frete Fixo | 2-Frete Grátis");
        FreteStrategy frete = FreteFactory.criar(sc.nextInt());

        try {
            double total = pedidoService.realizarPedido(pedido, pagamento, frete);
            System.out.println("Venda finalizada! Total: R$ " + total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void cadastrarPrato() {
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Estoque: ");
        int estoque = sc.nextInt();

        cardapioService.cadastrarPrato(new Prato(nome, preco, estoque));
    }
}