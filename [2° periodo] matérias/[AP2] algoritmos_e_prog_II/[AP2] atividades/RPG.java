import java.util.Scanner;

// Classe base para Personagem
abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int sp;

    public Personagem(String nome, int hp, int sp) {
        this.nome = nome;
        this.hp = hp;
        this.sp = sp;
    }

    public abstract void usarHabilidade();

    public void mostrarStatus() {
        System.out.println("Nome: " + nome + ", HP: " + hp + ", SP: " + sp);
    }
}

// Classe Mago
class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 100); // HP e SP iniciais
    }

    @Override
    public void usarHabilidade() {
        System.out.println(nome + " lança uma magia arcana!");
        sp -= 10; // Reduz SP ao usar a habilidade
    }
}

// Classe Guerreiro
class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 120, 50); // HP e SP iniciais
    }

    @Override
    public void usarHabilidade() {
        System.out.println(nome + " usa armaduras pesadas para se defender!");
        hp += 5; // Recupera um pouco de HP
    }
}

// Classe Sacerdote
class Sacerdote extends Personagem {
    public Sacerdote(String nome) {
        super(nome, 90, 80); // HP e SP iniciais
    }

    @Override
    public void usarHabilidade() {
        System.out.println(nome + " realiza um milagre divino!");
        sp -= 15; // Reduz SP ao usar a habilidade
    }
}

// Classe Ladrão
class Ladrao extends Personagem {
    public Ladrao(String nome) {
        super(nome, 70, 120); // HP e SP iniciais
    }

    @Override
    public void usarHabilidade() {
        System.out.println(nome + " fica invisível!");
        sp -= 20; // Reduz SP ao usar a habilidade
    }
}

// Classe Principal
public class RPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de RPG!");
        System.out.print("Digite o nome do seu personagem: ");
        String nome = scanner.nextLine();

        Personagem personagem = null;

        while (true) {
            System.out.println("\nEscolha uma classe:");
            System.out.println("1. Mago");
            System.out.println("2. Guerreiro");
            System.out.println("3. Sacerdote");
            System.out.println("4. Ladrão");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("Saindo do jogo...");
                break;
            }

            switch (opcao) {
                case 1:
                    personagem = new Mago(nome);
                    break;
                case 2:
                    personagem = new Guerreiro(nome);
                    break;
                case 3:
                    personagem = new Sacerdote(nome);
                    break;
                case 4:
                    personagem = new Ladrao(nome);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.println("\nVocê escolheu a classe: " + personagem.getClass().getSimpleName());
            while (true) {
                personagem.mostrarStatus();
                System.out.println("1. Usar Habilidade");
                System.out.println("2. Voltar ao menu de classes");
                int acao = scanner.nextInt();

                if (acao == 1) {
                    personagem.usarHabilidade();
                } else {
                    break;
                }
            }
        }

        scanner.close();
    }
}

