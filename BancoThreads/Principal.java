package BancoThreads;

public class Principal {


    public static void main(String[] args) {


        ContaBancaria co1 = new ContaBancaria(1, 250);
        ContaBancaria co2 = new ContaBancaria(2, 500);


        Thread t1 = new Thread(new ThreadDepositar(200, co1));
        Thread t2 = new Thread(new ThreadSacar(150, co1));
        Thread t3 = new Thread(new ThreadDepositar(300, co2));
        Thread t4 = new Thread(new ThreadSacar(50, co2));


        t1.start();
        t2.start();
        t3.start();
        t4.start();


        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("\nO saldo final da conta 1 é: " + co1.getSaldo());
        System.out.println("O saldo final da conta 2 é: " + co2.getSaldo());


    }


}





