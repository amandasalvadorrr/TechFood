package financeiro;

public class PixPagamento implements MetodoPagamento{
    public double calcular(double valor){
        return valor * 0.90;
    }
}
