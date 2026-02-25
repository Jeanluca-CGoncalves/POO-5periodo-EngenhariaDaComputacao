package RH.model;

public class Tecnico extends Funcionario {

    private String especialidade;

    public Tecnico(String nome, int id, double salario, String especialidade) {
        super(nome, id, salario);
        this.especialidade = especialidade;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Especialidade: " + especialidade);
    }
}