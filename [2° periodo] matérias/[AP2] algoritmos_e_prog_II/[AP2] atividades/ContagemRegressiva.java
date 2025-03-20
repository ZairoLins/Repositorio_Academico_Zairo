import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("Contagem regressiva:");
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Por favor, insira um número inteiro positivo.");
        }

        scanner.close();
    }
}
