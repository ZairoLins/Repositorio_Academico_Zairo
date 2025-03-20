package Exercicios.Entregador;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrega {
    private ArrayList<Pedido> pedidos;

    public Entrega() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Cliente cliente) {
        Pedido pedido = new Pedido(cliente);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do produto (ou 'sair' para finalizar): ");
            String nomeProduto = scanner.nextLine();
            if (nomeProduto.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o peso do produto: ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Limpa o buffer

            Item produto = new Item(nomeProduto, peso);
            pedido.adicionarProduto(produto);
        }

        pedidos.add(pedido);
        System.out.println("Pedido adicionado: " + pedido);
    }

    public void listarPedidos() {
        System.out.println("Lista de Pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}

