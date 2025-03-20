package Exercicios;

// Definindo a classe Pessoa
class Pessoa {
    // Atributos da classe
    String nome;
    int idade;

    // Método construtor para inicializar os atributos
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para cumprimentar a pessoa
    void cumprimentar() {
        System.out.println("Olá, " + nome + "! Seja bem-vindo!");
    }
}

public class Pessoas {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("Mateus", 25);

        // Imprimindo os atributos no console
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);

        // Chamando o método cumprimentar
        pessoa.cumprimentar();
    }
}


