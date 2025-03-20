package src;

import java.util.Scanner;

public class conversorDeTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSeja bem-vindo!");
        System.out.println("\n[1] Celsius para Fahrenheit \n[2] Fahrenheit para Celsius");
        System.out.println("\nSelecione uma opção:");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a temperatura em Celsius:");
            double tempCelsius = scanner.nextDouble();
            double tempFahrenheit = celsiusParaFahrenheit(tempCelsius);
            System.out.println("Temperatura em Fahrenheit: " + tempFahrenheit);
        }
        else if (escolha == 2) {
            System.out.println("Digite a temperatura em Fahrenheit:");
            double tempFahrenheit = scanner.nextDouble();
            double tempCelsius = fahrenheitParaCelsius(tempFahrenheit);
            System.out.println("Temperatura em Celsius: " + tempCelsius);
        }
        else {
            System.out.println("Escolha inválida. Por favor, escolha 1 ou 2.");
        }

        scanner.close();
    }
    public static double celsiusParaFahrenheit(double tempCelsius) {
        return (tempCelsius * 9 / 5) + 32;
    }
    public static double fahrenheitParaCelsius(double tempFahrenheit) {
        return (tempFahrenheit - 32) * 5 / 9;
    }
}