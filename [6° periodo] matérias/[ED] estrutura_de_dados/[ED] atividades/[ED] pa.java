import java.util.Scanner;

public class PA 
{
    public static int PAR(int inicial, int razao, int posicao)
    {
        /* código para fazer alguma coisa antes de verificar a condição de parada */
        int result;
        System.out.println("Chamada posicao ["+ posicao +"]"); // chamada atual
        //-----------------------------------------------------------------------


        if(posicao == 0)
        {
            /* código para fazer alguma coisa antes de retornar o valor da condição de parada */
            System.out.println("Condição de parada");  // condição de para
            //--------------------------------------------------------------------------------

            return inicial;
        }
        else
        {
            /* Trecho de código onde  problema é refinado, ou redefinido para um caso mais simples
             * pode-se inserir alguma programação aqui antes de fazer a chamada recursiva
             */
            System.out.println("Chamada recursiva para a posicao [" + (posicao-1) + "]");
            //------------------------------------------------------------------------------

            result = PAR(inicial, razao, posicao-1) + razao;   // refinamento do problema para um caso mais simples

            /* Aqui já temos o retorno da chamada recursiva, caso sea necessário fazer alguma coisa 
             * antes de retornar, esse é o local
            */
            System.out.println("Cahamada paraa posição [" + posicao + "] Recebendo retorno da chamada [" + (posicao-1)+ "]");
            //-------------------------------------------------------------------------------

            return   result; // retorna o anterior somado à razao
        }
        /* */
    }

    public static void main(final String[] args) 
    {
        int primeiro, razao, termo, resultado;
      
        Scanner leitor = new Scanner(System.in);
      
        System.out.print("Informe o termo inicial: "); 
        primeiro = leitor.nextInt();
        System.out.print("Informe a razao: "); 
        razao = leitor.nextInt();
        System.out.print("Informe a posição que deseja obter o termo: "); 
        termo = leitor.nextInt();
        
        resultado = PAR(primeiro, razao, termo);
        System.out.println("TERMO = " + resultado);

	}
}


