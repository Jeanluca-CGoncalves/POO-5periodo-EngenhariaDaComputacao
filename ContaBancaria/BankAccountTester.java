public class BankAccountTester {


    public static void main(String[] args){


        BankAccount conta = new BankAccount();


        conta.exib();


        conta.saldo = conta.dep(5000);


        conta.exib();


        conta.saldo = conta.sac(1200);


        conta.exib();


    }


}
