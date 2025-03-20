package Exercicios.Entregador;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Item> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Item produto) {
        produtos.add(produto);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Item> getProdutos() {
        return produtos;
    }

    public double calcularPesoTotal() {
        double totalPeso = 0;
        for (Item produto : produtos) {
            totalPeso += produto.getPeso();
        }
        return totalPeso;
    }

    @Override
    public String toString() {
        return cliente.toString() + ", Produtos: " + produtos + ", Peso Total: " + calcularPesoTotal() + " kg";
    }
}

