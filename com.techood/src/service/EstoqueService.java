package service;

import model.Prato;

public class EstoqueService {

    public boolean verificarEstoque(Prato prato, int qtd) {
        return prato.getEstoque() >= qtd;
    }

    public void darBaixa(Prato prato, int qtd) {
        prato.removerEstoque(qtd);
    }
}