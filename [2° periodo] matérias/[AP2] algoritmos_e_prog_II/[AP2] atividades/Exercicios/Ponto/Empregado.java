package Exercicios.Ponto;

public class Empregado {
    private String nome;
    private String cpf;

    public Empregado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}


