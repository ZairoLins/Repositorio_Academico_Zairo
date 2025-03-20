package Aula_15I02;
import java.util.Scanner;

public class FibonacciRecursivo {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
                  
    }
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma posição: ");
        int n = leitor.nextInt();

        System.out.println("O número de posição " + n + " na sequência é: " + fibonacci(n));
        
        leitor.close();
    }
}
