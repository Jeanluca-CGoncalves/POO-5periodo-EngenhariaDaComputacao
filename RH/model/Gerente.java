package RH.model;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, int id, double salario, String departamento) {
        super(nome, id, salario);
        this.departamento = departamento;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.20;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Departamento: " + departamento);
    }
}