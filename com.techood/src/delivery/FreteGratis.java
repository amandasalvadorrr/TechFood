package delivery;

public class FreteGratis implements FreteStrategy{
    public double calcularFrete(double valor){
        return valor >= 100? valor : valor + 15;
    }
}
