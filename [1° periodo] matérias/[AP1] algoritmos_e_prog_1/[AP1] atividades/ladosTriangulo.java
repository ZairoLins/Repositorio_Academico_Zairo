/*
Escreva um programa que solicite do usuário
os valores para os lados de um triângulo e informe se eles são válidos.
*/

package src;

import java.util.Scanner;

public class ladosTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.println("\n=====Validação de um triângulo=====");
        System.out.println("\nDigite o valor do primeiro lado de seu triângulo:");
        lado1 = sc.nextDouble();
        System.out.println("Digite o valor do segundo lado de seu triângulo:");
        lado2 = sc.nextDouble();
        System.out.println("Digite o valor do terceiro lado de seu triângulo:");
        lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Triângulo válido!");
        } else {
            System.out.println("Triângulo inválido!");
        }

    }
}

