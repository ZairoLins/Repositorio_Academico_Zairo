package Aula_15I02;

import java.util.Scanner;

public class FatorialRecursivo {
    public static long fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base: 0! = 1 e 1! = 1
        }
        return n * fatorial(n - 1); // A recursividade
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        System.out.println("O fatorial de " + n + " é: " + fatorial(n));
        
        scanner.close();
    }
}
