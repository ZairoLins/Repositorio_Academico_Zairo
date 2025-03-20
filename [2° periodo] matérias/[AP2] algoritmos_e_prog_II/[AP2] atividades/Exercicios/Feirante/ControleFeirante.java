package Exercicios.Feirante;

import java.util.Scanner;

public class ControleFeirante {
    public static void main(String[] args) {
        Feira feira = new Feira();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar Produto ao Estoque");
            System.out.println("2. Realizar Venda");
            System.out.println("3. Listar Produtos no Estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.print("Digite o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                System.out.print("Digite a quantidade do produto: ");
                int quantidade = scanner.nextInt();
                feira.adicionarProdutoAoEstoque(nome, preco, quantidade);
            } else if (opcao == 2) {
                feira.realizarVenda();
            } else if (opcao == 3) {
                feira.listarProdutosNoEstoque();
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}

