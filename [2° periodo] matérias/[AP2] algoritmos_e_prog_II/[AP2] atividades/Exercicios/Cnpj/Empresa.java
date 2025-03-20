package Exercicios.Cnpj;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário contratado: " + funcionario.getNome());
    }

    public void demitirFuncionario(String nomeFuncionario) {
        boolean removido = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nomeFuncionario)) {
                funcionarios.remove(funcionario);
                System.out.println("Funcionário demitido: " + nomeFuncionario);
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("Funcionário não encontrado: " + nomeFuncionario);
        }
    }

    public double calcularTotalSalarios() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getSalario();
        }
        return total;
    }

    public void exibirFuncionarios() {
        System.out.println("Funcionários da Empresa " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
