package BancoThreads;

public class ContaBancaria {


    private int NumeroConta;
    private double Saldo;
   
    public ContaBancaria(int numeroConta, double saldo) {
        NumeroConta = numeroConta;
        this.Saldo = saldo;
    }


    public synchronized void sacar(double valor){
        this.Saldo -= valor;
        System.out.println("O valor sacado foi de: " + valor + " o saldo atual é de: " + Saldo);
    }


    public synchronized void depositar(double valor){
        this.Saldo += valor;
        System.out.println("O valor depositado foi de: " + valor + " o saldo atual é de: " + Saldo);
    }


    public int getNumeroConta() {
        return NumeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        NumeroConta = numeroConta;
    }
    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double saldo) {
        Saldo = saldo;
    }


}
