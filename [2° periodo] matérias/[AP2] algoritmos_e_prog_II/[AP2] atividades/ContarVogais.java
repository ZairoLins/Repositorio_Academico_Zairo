import java.util.Scanner;

public class ContarVogais {
    public static int contarVogais(String palavra) {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < palavra.length(); i++) {
            if (vogais.indexOf(palavra.charAt(i)) != -1) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int quantidadeVogais = contarVogais(palavra);
        System.out.println("A palavra '" + palavra + "' contém " + quantidadeVogais + " vogais.");

        scanner.close();
    }
}
