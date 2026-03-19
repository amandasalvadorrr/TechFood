package financeiro;

public class PagamentoFactory {

    public static MetodoPagamento criar(int tipo) {
        switch (tipo) {
            case 1: return new PixPagamento();
            case 2: return new CreditoPagamento();
            case 3: return new EspeciePagamento();
            default: throw new IllegalArgumentException("Pagamento inválido");
        }
    }
}