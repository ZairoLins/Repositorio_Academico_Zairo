package Exercicios.Feirante;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Produto> produtosVendidos;

    public Venda() {
        produtosVendidos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.removerEstoque(quantidade)) {
            produtosVendidos.add(produto);
            System.out.println("Produto " + produto.getNome() + " vendido: " + quantidade);
        } else {
            System.out.println("Estoque insuficiente para " + produto.getNome());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtosVendidos) {
            total += produto.getPreco(); // Considerando que já descontamos a quantidade do estoque
        }
        return total;
    }
}

