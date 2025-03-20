package Aula_15I02;
import java.util.Scanner;

public class FibonacciIterativo {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
            //Se n for igual a 1 ou n for igual a dois, já retorna 1
        }
        
        int a = 1, b = 1, prox; // Como são os primeiros números, inicio a e b com 1, prox para armazenar o próximo valor 
        for (int i = 2; i <= n; i++) {
            prox = a + b; //prox recebe a soma de A e B 
            a = b; // A recebe B
            b = prox; // B recebe a soma, para continuar a sequencia na próxima iteração
        }
        
        return b;
    
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma posição: ");
        int n = leitor.nextInt();

        System.out.println("O número de posição " + n + " na sequência de Fibonacci é: " + fibonacci(n));
        
        leitor.close();
    }
}