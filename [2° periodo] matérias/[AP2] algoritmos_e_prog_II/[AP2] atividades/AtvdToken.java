// Classe base Token
class Token {
    protected String nome;
    protected double valor;

    public Token(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do Token: " + nome);
        System.out.println("Valor do Token: " + valor);
    }
}

// Subclasse TokenFungivel
class TokenFungivel extends Token {
    private int quantidade;

    public TokenFungivel(String nome, double valor, int quantidade) {
        super(nome, valor);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Quantidade: " + quantidade);
    }
}

// Subclasse TokenNaoFungivel
class TokenNaoFungivel extends Token {
    private String idUnico;

    public TokenNaoFungivel(String nome, double valor, String idUnico) {
        super(nome, valor);
        this.idUnico = idUnico;
    }

    public String getIdUnico() {
        return idUnico;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("ID Único: " + idUnico);
    }
}

// Classe Principal para testar as implementações
public class AtvdToken {
    public static void main(String[] args) {
        // Criando um Token Fungível
        TokenFungivel tokenFungivel = new TokenFungivel("Token A", 10.0, 100);
        System.out.println("Informações do Token Fungível:");
        tokenFungivel.mostrarInformacoes();

        System.out.println();

        // Criando um Token Não Fungível
        TokenNaoFungivel tokenNaoFungivel = new TokenNaoFungivel("Token B", 50.0, "ID12345");
        System.out.println("Informações do Token Não Fungível:");
        tokenNaoFungivel.mostrarInformacoes();
    }
}

