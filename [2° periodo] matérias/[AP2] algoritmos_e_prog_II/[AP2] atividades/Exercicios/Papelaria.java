package Exercicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido! Deve conter exatamente 11 dígitos.");
        }
    }
}

class Pedido {
    private int numero;
    private Date data;
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    public Pedido(int numero, Date data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirDetalhes() {
        System.out.println("Número do Pedido: " + numero);
        System.out.println("Data do Pedido: " + data);
        System.out.println("Cliente: " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
        System.out.println("Produtos no Pedido:");
        for (Produto produto : produtos) {
            System.out.println(" - " + produto);
        }
        System.out.println("Valor Total: R$" + calcularValorTotal());
    }
}

public class Papelaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando cliente com validação de CPF
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o CPF do cliente (11 dígitos): ");
        String cpf = scanner.nextLine();

        Cliente cliente = null;
        try {
            cliente = new Cliente(nomeCliente, cpf);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        // Lista de produtos disponíveis
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produto("Livro", 25.0));
        listaDeProdutos.add(new Produto("Caneta", 2.5));
        listaDeProdutos.add(new Produto("Caderno", 15.0));
        listaDeProdutos.add(new Produto("Mochila", 50.0));
        listaDeProdutos.add(new Produto("Lápis", 1.5));

        // Criando um pedido
        Pedido pedido = new Pedido(1, new Date(), cliente);

        // Adicionando produtos ao pedido
        while (true) {
            System.out.println("\nProdutos Disponíveis:");
            for (int i = 0; i < listaDeProdutos.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeProdutos.get(i));
            }
            System.out.println("0. Finalizar pedido");

            System.out.print("Escolha o número do produto para adicionar ao pedido: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                break;
            } else if (opcao > 0 && opcao <= listaDeProdutos.size()) {
                Produto produtoEscolhido = listaDeProdutos.get(opcao - 1);
                pedido.adicionarProduto(produtoEscolhido);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Exibindo detalhes do pedido
        System.out.println("\nDetalhes do Pedido:");
        pedido.exibirDetalhes();

        scanner.close();
    }
}
