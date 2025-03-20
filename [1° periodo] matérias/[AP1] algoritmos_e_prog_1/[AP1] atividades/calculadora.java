package src;

import java.util.Scanner;

public class calculadora {

    private static double resultado = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite qual operação deseja realizar ( + , - , * , / ).");
            String operacao = sc.nextLine();
            System.out.println("Digite um número: ");
            double valoDig = sc.nextDouble();
            System.out.println("Resultado atual: " + resultado);


            if (operacao.equals("s")) {
                System.out.println("Calculadora encerrada.");
                break;
            }

            resultado(operacao, valoDig);

            sc.nextLine();

        }
        sc.close();
    }

    private static void resultado(String operacao, double valoDig) {
        switch (operacao) {
            case "+":
                resultado = soma(resultado, valoDig);
                break;
            case "-":
                resultado = sub(resultado, valoDig);
                break;
            case "*":
                resultado = mult(resultado, valoDig);
                break;
            case "/":
                resultado = divi(resultado, valoDig);
        }
    }


    private static double soma(double a, double b) {
        return a + b;
    }
    private static double sub(double a, double b) {
        return a - b;
    }
    private static double mult(double a, double b) {
        return a * b;
    }
    private static double divi(double a, double b) {
        if (b != 0) {
            return a/b;
        } else {
            System.out.println("Falha! Divisão por zero.");
            return resultado;
        }
    }

}
