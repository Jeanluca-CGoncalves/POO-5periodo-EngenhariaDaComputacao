package BancoThreads;

public class ThreadDepositar implements Runnable{


    private double valor;
    ContaBancaria c1;


    public ThreadDepositar(double valor, ContaBancaria conta){
        this.valor = valor;
        c1 = conta;
    }


    public void run(){
        c1.depositar(valor);
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


}
