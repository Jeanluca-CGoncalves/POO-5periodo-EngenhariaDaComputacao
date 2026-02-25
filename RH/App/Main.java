package RH.App;

import RH.model.*;
import RH.service.RHService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RHService service = new RHService();
        int opcao;

        do {
            System.out.println("\n=== SISTEMA RH ===");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Técnico");
            System.out.println("3 - Listar Funcionários");
            System.out.println("4 - Remover Funcionário");
            System.out.println("5 - Atualizar Salário");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nomeG = sc.nextLine();
                    System.out.print("ID: ");
                    int idG = sc.nextInt();
                    System.out.print("Salário: ");
                    double salG = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Departamento: ");
                    String dep = sc.nextLine();

                    service.adicionarFuncionario(
                        new Gerente(nomeG, idG, salG, dep)
                    );
                    break;

                case 2:
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nomeT = sc.nextLine();
                    System.out.print("ID: ");
                    int idT = sc.nextInt();
                    System.out.print("Salário: ");
                    double salT = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Especialidade: ");
                    String esp = sc.nextLine();

                    service.adicionarFuncionario(
                        new Tecnico(nomeT, idT, salT, esp)
                    );
                    break;

                case 3:
                    service.listarFuncionarios();
                    break;

                case 4:
                    System.out.print("ID para remover: ");
                    int idRem = sc.nextInt();
                    service.removerFuncionario(idRem);
                    break;

                case 5:
                    System.out.print("ID para atualizar: ");
                    int idAlt = sc.nextInt();
                    System.out.print("Novo salário: ");
                    double novoSal = sc.nextDouble();
                    service.atualizarSalario(idAlt, novoSal);
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}