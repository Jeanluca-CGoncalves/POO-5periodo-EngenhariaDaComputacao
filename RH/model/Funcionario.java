package RH.model;

public abstract class Funcionario {

    private String nome;
    private int id;
    private double salario;

    public Funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + calcularBonus());
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}