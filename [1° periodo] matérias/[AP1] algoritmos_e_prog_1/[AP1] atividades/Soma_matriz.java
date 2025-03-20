package src;

import java.util.Scanner;

public class Soma_matriz {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o número de linhas da matriz: ");
        int linhas = leitor.nextInt();
        System.out.print("Informe o número de colunas da matriz: ");
        int colunas = leitor.nextInt();

        int[][] A = new int[linhas][colunas];
        int[][] B = new int[linhas][colunas];
        int[][] soma = new int[linhas][colunas];

        System.out.println("Preencha a matriz A: ");
        preencherMatriz(A, leitor);

        System.out.println("Preencha a matriz B: ");
        preencherMatriz(B, leitor);

        somaMatrizes(A, B, soma);

        System.out.println("\nMatriz A: ");
        exibitMatriz(A);

        System.out.println("\nMatriz B: ");
        exibitMatriz(B);

        System.out.println("\nMatriz resultado: ");
        exibitMatriz(soma);
    }
    public static void preencherMatriz(int [][] matriz, Scanner leitor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++ ) {
                System.out.print("Digite o valor para a posição [" + i + "] [" + j + "]: " );
                matriz[i][j] = leitor.nextInt();
            }
        }
    }
    public static void somaMatrizes(int[][] A, int [][] B, int [][] resultado) {
        for (int i = 0; i < A.length; i ++) {
            for (int j = 0; j < A[0].length; j++) {
                resultado[i][j] = A[i][j] + B [i][j];
            }
        }
    }
    public static void exibitMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
