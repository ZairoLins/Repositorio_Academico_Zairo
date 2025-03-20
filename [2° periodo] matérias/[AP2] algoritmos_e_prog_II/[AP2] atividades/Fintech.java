import java.util.Scanner;

// Classe base para Conta
class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

// Conta com limite adicional
class ContaComLimite extends Conta {
    private double limite;

    public ContaComLimite(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com limite. Saldo atual: " + saldo);
            return true;
        } else {
            System.out.println("Saldo e limite insuficientes para o saque.");
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }
}

// Conta com rendimento diário
class ContaComRendimento extends Conta {
    private double taxaRendimento;

    public ContaComRendimento(double saldoInicial, double taxaRendimento) {
        super(saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
        System.out.println("Rendimento aplicado. Saldo atual com rendimento: " + saldo);
    }
}

// Classe Principal com Menu
public class Fintech {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando as contas
        Conta contaCorrente = new Conta(500);
        ContaComLimite contaLimite = new ContaComLimite(500, 200);
        ContaComRendimento contaRendimento = new ContaComRendimento(500, 0.01);

        while (true) {
            System.out.println("\nSelecione a conta que deseja usar:");
            System.out.println("1. Conta Corrente");
            System.out.println("2. Conta Com Limite");
            System.out.println("3. Conta Com Rendimento");
            System.out.println("4. Sair");

            int opcaoConta = scanner.nextInt();

            if (opcaoConta == 4) {
                System.out.println("Saindo...");
                break;
            }

            System.out.println("Escolha a operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            if (opcaoConta == 3) {
                System.out.println("3. Aplicar Rendimento");
            }
            int operacao = scanner.nextInt();

            switch (opcaoConta) {
                case 1: // Conta Corrente
                    realizarOperacao(contaCorrente, operacao, scanner);
                    break;
                case 2: // Conta Com Limite
                    realizarOperacao(contaLimite, operacao, scanner);
                    break;
                case 3: // Conta Com Rendimento
                    if (operacao == 3) {
                        contaRendimento.aplicarRendimento();
                    } else {
                        realizarOperacao(contaRendimento, operacao, scanner);
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    public static void realizarOperacao(Conta conta, int operacao, Scanner scanner) {
        switch (operacao) {
            case 1: // Depositar
                System.out.print("Digite o valor para depositar: ");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                break;
            case 2: // Sacar
                System.out.print("Digite o valor para sacar: ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }
}


