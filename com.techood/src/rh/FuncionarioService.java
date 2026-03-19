package rh;

import model.Funcionario;
import java.util.ArrayList;

public class FuncionarioService {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void contratar(Funcionario f) {
        funcionarios.add(f);
    }

    public void listar() {
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(i + " - " + funcionarios.get(i).getNome());
        }
    }

    public void aumentarSalario(int index, double porcentagem) {
        Funcionario f = funcionarios.get(index);
        double novo = f.getSalario() + f.getSalario() * (porcentagem / 100);
        f.setSalario(novo);
    }
}