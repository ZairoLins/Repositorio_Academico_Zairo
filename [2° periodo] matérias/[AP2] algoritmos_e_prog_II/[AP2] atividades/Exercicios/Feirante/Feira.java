package Exercicios.Feirante;

import java.util.Scanner;

public class Feira {
    private Estoque estoque;

    public Feira() {
        estoque = new Estoque();
    }

    public void adicionarProdutoAoEstoque(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        estoque.adicionarProduto(produto);
        System.out.println("Produto adicionado ao estoque: " + produto);
    }

    public void realizarVenda() {
        Scanner scanner = new Scanner(System.in);
        Venda venda = new Venda();

        System.out.print("Digite o nome do produto para vender: ");
        String nomeProduto = scanner.nextLine();
        Produto produto = estoque.buscarProduto(nomeProduto);

        if (produto != null) {
            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();
            venda.adicionarProduto(produto, quantidade);
            System.out.println("Total da venda: R$ " + venda.calcularTotal());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void listarProdutosNoEstoque() {
        System.out.println("Produtos no estoque:");
        estoque.listarProdutos();
    }
}

