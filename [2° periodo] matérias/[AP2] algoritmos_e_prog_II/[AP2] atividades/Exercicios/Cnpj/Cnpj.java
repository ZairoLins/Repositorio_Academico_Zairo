package Exercicios.Cnpj;

import java.util.Scanner;

public class Cnpj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma empresa
        System.out.print("Digite o nome da empresa: ");
        String nomeEmpresa = scanner.nextLine();
        System.out.print("Digite o CNPJ da empresa: ");
        String cnpj = scanner.nextLine();

        Empresa empresa = new Empresa(nomeEmpresa, cnpj);

        // Contratação de funcionários
        while (true) {
            System.out.println("\n1. Contratar Funcionário");
            System.out.println("2. Demitir Funcionário");
            System.out.println("3. Exibir Funcionários");
            System.out.println("4. Calcular Total de Salários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.print("Nome do funcionário: ");
                String nomeFuncionario = scanner.nextLine();
                System.out.print("Salário do funcionário: ");
                double salario = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer

                Funcionario funcionario = new Funcionario(nomeFuncionario, salario);
                empresa.contratarFuncionario(funcionario);

            } else if (opcao == 2) {
                System.out.print("Nome do funcionário a ser demitido: ");
                String nomeFuncionario = scanner.nextLine();
                empresa.demitirFuncionario(nomeFuncionario);

            } else if (opcao == 3) {
                empresa.exibirFuncionarios();

            } else if (opcao == 4) {
                System.out.println("Total de Salários: R$" + empresa.calcularTotalSalarios());

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
