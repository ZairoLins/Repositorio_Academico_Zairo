package Exercicios.Entregador;

import java.util.Scanner;

public class Entregador {
    public static void main(String[] args) {
        Entrega entrega = new Entrega();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar Pedido");
            System.out.println("2. Listar Pedidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.print("Digite o nome do cliente: ");
                String nomeCliente = scanner.nextLine();
                System.out.print("Digite o endereço do cliente: ");
                String enderecoCliente = scanner.nextLine();
                Cliente cliente = new Cliente(nomeCliente, enderecoCliente);
                entrega.adicionarPedido(cliente);
            } else if (opcao == 2) {
                entrega.listarPedidos();
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}

