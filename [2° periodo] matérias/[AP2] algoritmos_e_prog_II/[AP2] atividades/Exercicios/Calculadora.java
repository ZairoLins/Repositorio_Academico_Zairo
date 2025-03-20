package Exercicios;

// Definindo a classe Calculadora
class Calculo {
    // Método para somar dois números
    public double somar(double a, double b) {
        return a + b;
    }

    // Método para subtrair dois números
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dois números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dois números
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}

class Calculadora {
    public static void main(String[] args) {
        // Criando um objeto da classe Calculadora
        Calculo calculadora= new Calculo();

        // Definindo dois números para operações
        double num1 = 10;
        double num2 = 5;

        // Realizando operações e imprimindo os resultados
        System.out.println("Soma: " + calculadora.somar(num1, num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2));
        System.out.println("Divisão: " + calculadora.dividir(num1, num2));
    }
}

