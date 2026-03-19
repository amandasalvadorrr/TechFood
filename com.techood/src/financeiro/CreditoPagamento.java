package financeiro;

public class CreditoPagamento implements MetodoPagamento{
    public double calcular(double valor){
        return valor * 1.05;
    }
}
