package src;

import java.util.Scanner;

public class relacionalSalarial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeDeMaior = 18;
        int idadeDeAluno;
        double salariominimo = 980;
        double salarioPessoa;

        System.out.println("\nDigite a idade do aluno:");
        idadeDeAluno = sc.nextInt();
        System.out.println("Digite o salário da pessoa:");
        salarioPessoa = sc.nextDouble();

        System.out.println("O aluno é de maior? " + (idadeDeAluno >= idadeDeMaior));
        System.out.println("O salário da pessoa é o minímo? " + (salarioPessoa == salariominimo));

        sc.close();


    }
}

