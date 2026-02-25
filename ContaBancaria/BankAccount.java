public class BankAccount {


    int ID = 0;
    double saldo = 0;


    public double dep(int valor){


        saldo =  saldo + valor;


        return saldo;


    }
    public double sac(int valor){


        saldo =  saldo - valor;


        return saldo;


    }
    public void exib(){


        System.out.println(saldo);


    }


}
