import java.util.Scanner;

public class MediaDeNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loop que solicitará a nota de 3 alunos
        for (int i = 1; i <= 3; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Digite a nota da A1: ");
            double a1 = sc.nextDouble();

            System.out.print("Digite a nota da A2: ");
            double a2 = sc.nextDouble();

            double media = calcularMedia(a1, a2);
            System.out.printf("Média: %.2f\n", media);

            //Estrutura que irá verificar a nota do aluno
            if (media < 4) {
                System.out.println("Status: Reprovado.");
            } else if (media >= 4 && media < 6) {
                System.out.println("Status: Exame Final.");
                System.out.print("Digite a nota do Exame Final: ");
                double exameFinal = sc.nextDouble();
                double mediaFinal = calcularMediaFinal(media, exameFinal);
                System.out.printf("Média Final: %.2f\n", mediaFinal);

                if (mediaFinal >= 6) {
                    System.out.println("Status: Aprovado.");
                } else {
                    System.out.println("Status: Reprovado.");
                }
            } else {
                System.out.println("Status: Aprovado.");
            }
            System.out.println();
        }

        sc.close();
    }

    //Função para calcular a média das provas A1 e A2
    public static double calcularMedia(double a1, double a2) {
        return (a1 + a2) / 2;
    }

    //Função para calcular a média final, considerando o exame
    public static double calcularMediaFinal(double media, double exameFinal) {
        return (media + exameFinal) / 2;
    }
}

