import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Classe Produto com encapsulamento
class Produto {
    private String nome;  // Atributo privado
    private double preco; // Atributo privado

    // Construtor da classe Produto
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getter para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Getter para obter o preço do produto
    public double getPreco() {
        return preco;
    }
}

// Classe Carrinho com encapsulamento
class Carrinho {
    private Map<Produto, Integer> itens; // Atributo privado para armazenar produtos e suas quantidades

    // Construtor da classe Carrinho
    public Carrinho() {
        this.itens = new HashMap<>();
    }

    // Método público para adicionar produtos ao carrinho
    public void adicionarProduto(Produto produto, int quantidade) {
        if (itens.containsKey(produto)) {
            itens.put(produto, itens.get(produto) + quantidade);
        } else {
            itens.put(produto, quantidade);
        }
        System.out.println(quantidade + " unidade(s) de " + produto.getNome() + " adicionada(s) ao carrinho.");
    }

    // Método público para remover produtos do carrinho
    public void removerProduto(Produto produto) {
        if (itens.containsKey(produto)) {
            itens.remove(produto);
            System.out.println(produto.getNome() + " removido do carrinho.");
        } else {
            System.out.println(produto.getNome() + " não encontrado no carrinho.");
        }
    }

    // Método público para atualizar a quantidade de um produto no carrinho
    public void atualizarQuantidade(Produto produto, int novaQuantidade) {
        if (itens.containsKey(produto)) {
            if (novaQuantidade > 0) {
                itens.put(produto, novaQuantidade);
                System.out.println("Quantidade de " + produto.getNome() + " atualizada para " + novaQuantidade);
            } else {
                removerProduto(produto);
            }
        } else {
            System.out.println(produto.getNome() + " não encontrado no carrinho.");
        }
    }

    // Método público para calcular o valor total do carrinho
    public double calcularTotal() {
        double total = 0.0;
        for (Map.Entry<Produto, Integer> item : itens.entrySet()) {
            total += item.getKey().getPreco() * item.getValue();
        }
        return total;
    }

    // Método público para exibir o carrinho
    public void exibirCarrinho() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Carrinho de compras:");
            for (Map.Entry<Produto, Integer> item : itens.entrySet()) {
                System.out.println(item.getKey().getNome() + " - Quantidade: " + item.getValue() + " - Preço: R$ " + item.getKey().getPreco());
            }
        }
    }
}

// Classe principal para testar o carrinho
public class LojaOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        // Criando alguns produtos
        Produto produto1 = new Produto("Celular", 1500.0);
        Produto produto2 = new Produto("Notebook", 3500.0);
        Produto produto3 = new Produto("Fone de Ouvido", 250.0);

        boolean rodando = true;

        while (rodando) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Remover produto do carrinho");
            System.out.println("3. Atualizar quantidade de produto");
            System.out.println("4. Exibir carrinho");
            System.out.println("5. Exibir valor total");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o produto:");
                    System.out.println("1. Celular");
                    System.out.println("2. Notebook");
                    System.out.println("3. Fone de Ouvido");
                    int produtoEscolhido = scanner.nextInt();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();

                    if (produtoEscolhido == 1) {
                        carrinho.adicionarProduto(produto1, quantidade);
                    } else if (produtoEscolhido == 2) {
                        carrinho.adicionarProduto(produto2, quantidade);
                    } else if (produtoEscolhido == 3) {
                        carrinho.adicionarProduto(produto3, quantidade);
                    } else {
                        System.out.println("Produto inválido.");
                    }
                    break;

                case 2:
                    System.out.println("Escolha o produto para remover:");
                    System.out.println("1. Celular");
                    System.out.println("2. Notebook");
                    System.out.println("3. Fone de Ouvido");
                    produtoEscolhido = scanner.nextInt();

                    if (produtoEscolhido == 1) {
                        carrinho.removerProduto(produto1);
                    } else if (produtoEscolhido == 2) {
                        carrinho.removerProduto(produto2);
                    } else if (produtoEscolhido == 3) {
                        carrinho.removerProduto(produto3);
                    } else {
                        System.out.println("Produto inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Escolha o produto para atualizar a quantidade:");
                    System.out.println("1. Celular");
                    System.out.println("2. Notebook");
                    System.out.println("3. Fone de Ouvido");
                    produtoEscolhido = scanner.nextInt();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();

                    if (produtoEscolhido == 1) {
                        carrinho.atualizarQuantidade(produto1, novaQuantidade);
                    } else if (produtoEscolhido == 2) {
                        carrinho.atualizarQuantidade(produto2, novaQuantidade);
                    } else if (produtoEscolhido == 3) {
                        carrinho.atualizarQuantidade(produto3, novaQuantidade);
                    } else {
                        System.out.println("Produto inválido.");
                    }
                    break;

                case 4:
                    carrinho.exibirCarrinho();
                    break;

                case 5:
                    System.out.println("Valor total: R$ " + carrinho.calcularTotal());
                    break;

                case 6:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
