package financeiro;

public class EspeciePagamento implements MetodoPagamento{
    public double calcular(double valor){
        return valor * 0.92;
    }
}
