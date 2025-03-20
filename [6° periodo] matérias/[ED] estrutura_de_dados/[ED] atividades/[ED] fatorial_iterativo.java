package Aula_15I02;
import java.util.Scanner;

public class FatorialIterativo {
    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        System.out.println("O fatorial de " + n + " é: " + fatorial(n));
        
        scanner.close();
    }
}
