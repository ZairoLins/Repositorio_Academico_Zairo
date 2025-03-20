package src;

import java.util.Scanner;

public class conversorDeUnidades {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Seja bem-vindo(a)!");
        System.out.println("\n[1] Metros para Pés.");
        System.out.println("[1] Litros para Galões.");
        System.out.println("[3] Metros para polegadas.");
        System.out.println("\nSelecione a opção que deseja utilizar:");

        int escolha = leitor.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a quantidade em metros:");
            double metros = leitor.nextDouble();
            double pes = metrosParaPes(metros);
            System.out.println("Quantidade em Pés: " + pes);
        } else if (escolha == 2) {
            System.out.println("Digite a quantidade em litros:");
            double litros = leitor.nextDouble();
            double galoes = litrosParaGaloes(litros);
            System.out.println("Quantidade em Galões: " + galoes);
        } else if (escolha == 3) {
            System.out.println("Digite a quantidade em metros:");
            double metros = leitor.nextDouble();
            double polegadas = metrosParaPolegadas(metros);
            System.out.println("Quantidade de polegadas: " + polegadas);
        } else {
            System.out.println("Escolha inválida. Por favor, escolha 1 ou 2.");
        }

        leitor.close();
    }
    public static double metrosParaPes(double metros) {
        return metros * 3.28084;
    }
    public static double litrosParaGaloes(double litros) {
        return litros * 0.264172;
    }
    public static double metrosParaPolegadas(double metros) {
        return metros * 39.97;
    }
}


