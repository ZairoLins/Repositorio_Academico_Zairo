package Exercicios.Ponto;

import java.util.Scanner;

public class ControleDePonto {
    public static void main(String[] args) {
        ControlePonto controle = new ControlePonto();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar Funcionário");
            System.out.println("2. Registrar Entrada");
            System.out.println("3. Registrar Saída");
            System.out.println("4. Exibir Relatório de Pontos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.print("Digite o nome do funcionário: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o CPF do funcionário: ");
                String cpf = scanner.nextLine();
                Empregado funcionario = new Empregado(nome, cpf);
                controle.adicionarFuncionario(funcionario);

            } else if (opcao == 2) {
                System.out.print("Digite o CPF do funcionário para registrar entrada: ");
                String cpf = scanner.nextLine();
                Empregado funcionario = controle.buscarFuncionarioPorCpf(cpf);
                if (funcionario != null) {
                    controle.registrarEntrada(funcionario);
                } else {
                    System.out.println("Funcionário não encontrado.");
                }

            } else if (opcao == 3) {
                System.out.print("Digite o CPF do funcionário para registrar saída: ");
                String cpf = scanner.nextLine();
                Empregado funcionario = controle.buscarFuncionarioPorCpf(cpf);
                if (funcionario != null) {
                    controle.registrarSaida(funcionario);
                } else {
                    System.out.println("Funcionário não encontrado.");
                }

            } else if (opcao == 4) {
                controle.exibirRelatorio();
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
