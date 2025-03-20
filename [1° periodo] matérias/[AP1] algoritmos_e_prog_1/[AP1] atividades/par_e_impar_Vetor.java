package src;
import java.util.Scanner;

public class par_e_impar_Vetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanho = 10;
        int [] Vetor = new int [tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um vetor: ");
            Vetor [i] = scan.nextInt();
        }
        int par = 0;
        int impar = 0;
        for (int i = 0; i < tamanho; i++) {
            if (Vetor[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Números pares: " + par);
        System.out.println("Números impáres: " + impar);
    }
}