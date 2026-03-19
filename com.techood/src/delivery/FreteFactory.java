package delivery;

public class FreteFactory {

    public static FreteStrategy criar(int tipo) {
        switch (tipo) {
            case 1: return new FreteFixo();
            case 2: return new FreteGratis();
            default: throw new IllegalArgumentException("Frete inválido");
        }
    }
}