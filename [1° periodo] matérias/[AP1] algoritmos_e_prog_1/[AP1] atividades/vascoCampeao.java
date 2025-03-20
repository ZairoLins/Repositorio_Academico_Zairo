/*
Sabendo que em um campeonato de futebol cada time ganha 3 pontos por vitória e um ponto por empate,
escreva um programa que solicite do usuário a quantidade de vitórias e empates de dois times
e informe qual deles estará mais bem classificado no campeonato.
 */
package src;

import java.util.Scanner;

public class vascoCampeao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vit1, vit2, empt1, empt2, tot1, tot2;
        String timeA;
        String timeB;

        System.out.println("\n===Campeonato VascoCampeaoForever===");
        System.out.println("Digite a quantidade de vitórias do time 1:");
        vit1 = sc.nextInt();
        System.out.println("Digite a quantidade de empates do time 1:");
        empt1 = sc.nextInt();
        System.out.println("\n====================================\n");
        System.out.println("Digite a quantidade de vitórias do time 2:");
        vit2 = sc.nextInt();
        System.out.println("Digite a quantidade de empates do time 2:");
        empt2 = sc.nextInt();
        System.out.println("\n=====================================");

        tot1 = (vit1 * 3) + (empt1 * 1);
        tot2 = (vit2 * 3) + (empt2 * 1);

        if (tot1 > tot2) {
            System.out.println("\n===Resultado final===");
            System.out.println("\nPontos do time 1: " + tot1);
            System.out.println("Pontos do time 2: " + tot2);
            System.out.println("\nO time campeão foi o time 1!!");
            System.out.println("\n=====================");
        } else if (tot2 > tot1) {
            System.out.println("\n===Resultado final===");
            System.out.println("\nPontos do time 1: " + tot1);
            System.out.println("Pontos do time 2: " + tot2);
            System.out.println("\nO time campeão foi o time 2!!");
            System.out.println("\n=====================");
        } else {
            System.out.println("\n===Resultado final===");
            System.out.println("\nPontos do time 1: " + tot1);
            System.out.println("Pontos do time 2: " + tot2);
            System.out.println("\nOS DOIS TIMES EMPATARAM!!");
            System.out.println("\n=====================");
        }
    }
}
