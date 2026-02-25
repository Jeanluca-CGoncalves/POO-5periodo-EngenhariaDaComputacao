package RH.service;

import RH.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class RHService {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario f : funcionarios) {
            f.imprimirDetalhes();
            System.out.println("---------------------");
        }
    }

    public void removerFuncionario(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
        System.out.println("Funcionário removido.");
    }

    public void atualizarSalario(int id, double novoSalario) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                f.setSalario(novoSalario);
                System.out.println("Salário atualizado.");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }
}