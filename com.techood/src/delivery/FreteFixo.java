package delivery;

public class FreteFixo implements FreteStrategy{
    public double calcularFrete(double valor){
        return valor + 15;
    }
}
