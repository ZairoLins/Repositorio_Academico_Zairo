package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Livros {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livros(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
}

class Biblioteca {
    private ArrayList<Livros> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livros livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void removerLivro(String titulo) {
        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(livro);
                System.out.println("Livro removido: " + titulo);
                return;
            }
        }
        System.out.println("Livro não encontrado: " + titulo);
    }

    public Livros buscarLivroPorTitulo(String titulo) {
        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Remover livro");
            System.out.println("3. Buscar livro pelo título");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (opcao == 1) {
                System.out.print("Digite o título do livro: ");
                String titulo = scanner.nextLine();
                System.out.print("Digite o autor do livro: ");
                String autor = scanner.nextLine();
                System.out.print("Digite o ano de publicação: ");
                int anoPublicacao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                Livros livro = new Livros(titulo, autor, anoPublicacao);
                biblioteca.adicionarLivro(livro);

            } else if (opcao == 2) {
                System.out.print("Digite o título do livro a ser removido: ");
                String titulo = scanner.nextLine();
                biblioteca.removerLivro(titulo);

            } else if (opcao == 3) {
                System.out.print("Digite o título do livro para busca: ");
                String titulo = scanner.nextLine();
                Livros livro = biblioteca.buscarLivroPorTitulo(titulo);
                if (livro != null) {
                    System.out.println("\nLivro encontrado:");
                    livro.exibirDetalhes();
                } else {
                    System.out.println("Livro não encontrado.");
                }

            } else if (opcao == 4) {
                System.out.println("Encerrando o sistema...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

