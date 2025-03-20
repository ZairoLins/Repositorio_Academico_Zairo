package src;

import java.util.Scanner;
import java.lang.Math;

public class jurosComposto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double montAcum, capInv, taxRen, temMes;

        System.out.println("---- Cálculo de juros compostos ----");
        System.out.print("Digite o valor investido: ");
        capInv = sc.nextDouble();
        System.out.print("Digite a taxa de taxa de rentabilidade: ");
        taxRen = sc.nextDouble();
        System.out.print("Digite o tempo do investimento em meses: ");
        temMes = sc.nextDouble();
        System.out.println("------------------------------------");

        taxRen = taxRen + 1;
        System.out.println(taxRen);
        montAcum = capInv * Math.pow(taxRen, temMes);
        System.out.println(montAcum);

    }

}


