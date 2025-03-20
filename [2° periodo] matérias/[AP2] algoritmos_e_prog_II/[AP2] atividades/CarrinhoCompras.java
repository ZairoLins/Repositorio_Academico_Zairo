import java.util.ArrayList;
import java.util.List;

// Exceção personalizada para itens inválidos
class ItemInvalidoException extends Exception {
    public ItemInvalidoException(String message) {
        super(message);
    }
}

// Exceção personalizada para estoque insuficiente
class EstoqueInsuficienteException extends Exception {
    public EstoqueInsuficienteException(String message) {
        super(message);
    }
}

// Classe base para itens
abstract class Item {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Item(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void reduzirEstoque(int quantidade) throws EstoqueInsuficienteException {
        if (quantidade > quantidadeEmEstoque) {
            throw new EstoqueInsuficienteException("Estoque insuficiente para o item: " + nome);
        }
        quantidadeEmEstoque -= quantidade;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco + " (Estoque: " + quantidadeEmEstoque + ")";
    }
}

// Subclasse para eletrônicos
class Eletronico extends Item {
    public Eletronico(String nome, double preco, int quantidadeEmEstoque) {
        super(nome, preco, quantidadeEmEstoque);
    }
}

// Subclasse para alimentos
class Alimento extends Item {
    public Alimento(String nome, double preco, int quantidadeEmEstoque) {
        super(nome, preco, quantidadeEmEstoque);
    }
}

// Classe para gerenciar o carrinho de compras
class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item, int quantidade) throws EstoqueInsuficienteException {
        item.reduzirEstoque(quantidade);
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Carrinho de Compras:\n");
        for (Item item : itens) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}

// Classe principal para testar o sistema
public class CarrinhoCompras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        try {
            Eletronico smartphone = new Eletronico("Smartphone", 1500.00, 5);
            Alimento arroz = new Alimento("Arroz", 20.00, 10);

            // Adicionando itens ao carrinho
            carrinho.adicionarItem(smartphone, 1);
            carrinho.adicionarItem(arroz, 2);

            System.out.println(carrinho);
            System.out.println("Total: R$" + carrinho.calcularTotal());

            // Tentando adicionar mais itens do que o estoque permite
            carrinho.adicionarItem(smartphone, 6);
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
