import java.util.Scanner;

public class ConversorDeTemperatura {

    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para converter Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Método principal com o menu e a lógica do programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\nMenu de Conversão de Temperaturas");
            System.out.println("1. Converter Celsius para Fahrenheit");
            System.out.println("2. Converter Fahrenheit para Celsius");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusParaFahrenheit(celsius);
                    System.out.printf("%.2f°C é equivalente a %.2f°F\n", celsius, fahrenheit);
                    break;

                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = fahrenheitParaCelsius(fahrenheit);
                    System.out.printf("%.2f°F é equivalente a %.2f°C\n", fahrenheit, celsius);
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (escolha != 3);

        scanner.close();
    }
}
