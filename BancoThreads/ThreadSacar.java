package BancoThreads;

public class ThreadSacar implements Runnable{


    private double valor;
    ContaBancaria c1;


    public ThreadSacar(double valor, ContaBancaria conta){
        this.valor = valor;
        c1 = conta;
    }


    public void run(){
        c1.sacar(valor);
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


}
