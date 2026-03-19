package service;

import model.Prato;
import java.util.ArrayList;

public class CardapioService {

    private ArrayList<Prato> pratos = new ArrayList<>();

    public void cadastrarPrato(Prato prato) {
        pratos.add(prato);
    }

    public void listarPratos() {
        for (int i = 0; i < pratos.size(); i++) {
            Prato p = pratos.get(i);
            System.out.println(i + " - " + p.getNome() + " | R$ " + p.getPreco() + " | Estoque: " + p.getEstoque());
        }
    }

    public Prato buscarPorIndice(int index) {
        return pratos.get(index);
    }

    public void carregarDadosIniciais() {
        cadastrarPrato(new Prato("Feijoada", 45, 10));
        cadastrarPrato(new Prato("Moqueca", 65, 5));
        cadastrarPrato(new Prato("Baião de Dois", 35, 8));
    }
}