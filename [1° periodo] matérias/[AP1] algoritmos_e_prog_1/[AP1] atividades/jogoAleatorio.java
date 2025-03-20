/*
Faça um jogo no qual será gerado um número aleatório entre 1 e 10000.
O usuário poderá chutar até 20 vezes
Caso ele chute um número menor que o gerado aleatóriamente, imprima “é um número MAIOR”, se ele digitar um maior imprima “é um número MENOR”.
Quando ele acertar, uma mensagem de PARABÉNS deve ser impressa
Caso ele não acerte em 20 tentativas imprima “Infelizmente você perdeu!
*/

package src;

import java.util.Random;
import java.util.Scanner;

public class jogoAleatorio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ale = new Random();

        int aleatorio = ale.nextInt(10000) + 1;
        int chute = 20;
        int numdig;

        System.out.println("\n===== Jogo da advinhação =====");

        while (chute > 0) {

            System.out.println("\nDigite um número:");
            numdig = sc.nextInt();

            if (numdig == aleatorio) {
                System.out.println("Parábens! Você acertou!");
                return;
            } else if (numdig < aleatorio) {
                System.out.println("Dica: O número é maior!");
            } else {
                System.out.println("Dica: O número é menor!");
            }
            chute--;
            System.out.println("Restam apenas " + chute + " chutes!");
        }
        System.out.println("\nQue pena! Não foi dessa vez, o número era: " + aleatorio);
    }
}

