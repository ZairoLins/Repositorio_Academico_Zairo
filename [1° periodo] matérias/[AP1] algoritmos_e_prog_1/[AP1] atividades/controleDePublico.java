/*
Escreva um algoritmo que solicite do usuário a capacidade de um estádio de futebol e a quantidade de pessoas presentes em um jogo.
O programa deve informar se o estádio está lotado (acima de 80% de ocupação),
parcialmente lotado (acima de 50% de ocupação) ou vazio (abaixo de 20% de ocupação).
*/

package src;

import java.util.Scanner;

public class controleDePublico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ocupacao, capacidade, publico;
        String nome;

        System.out.println("=====Controle de público=====");

        System.out.println("Digite o nome do estádio:");
        nome = sc.nextLine();

        System.out.println("Digite a capacidade do estádio:");
        capacidade = sc.nextDouble();

        System.out.println("Digite o publico presente mo estádio:");
        publico = sc.nextDouble();

        ocupacao = (publico / capacidade) * 100;

        if (ocupacao >= 80) {
            System.out.println("\n=====Relatório Situacional=====");
            System.out.println("\n-Estádio: " + nome);
            System.out.println("-Capacidade máxima: " + capacidade);
            System.out.println("-Publico atual: " + publico);
            System.out.println("-Ocupação: " + ocupacao + "%");
            System.out.println("-O estádio está LOTADO");
            System.out.println("\n===============================");
        } else if (ocupacao >= 50) {
            System.out.println("\n=====Relatório Situacional=====");
            System.out.println("\n-Estádio: " + nome);
            System.out.println("-Capacidade máxima: " + capacidade);
            System.out.println("-Publico atual: " + publico);
            System.out.println("-Ocupação: " + ocupacao + "%");
            System.out.println("-O estádio está PARCIALMENTE LOTADO");
            System.out.println("\n===============================");
        } else if (ocupacao <= 20) {
            System.out.println("\n=====Relatório Situacional=====");
            System.out.println("\n-Estádio: " + nome);
            System.out.println("-Capacidade máxima: " + capacidade);
            System.out.println("-Publico atual: " + publico);
            System.out.println("-Ocupação: " + ocupacao + "%");
            System.out.println("-O estádio está VAZIO");
            System.out.println("\n===============================");
        }
    }
}
