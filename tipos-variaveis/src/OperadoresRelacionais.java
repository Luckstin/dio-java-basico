public class OperadoresRelacionais{
/*Operadores Relacionais
 * Avaliam a relação entre duas variáveis ou expressões
 * (==) verifica se hà igualdade
 * (!=) verifica se hà diferença
 * (>) verifica se é maior
 * (>=) verifica se é maior ou igual
 * (<) verifica se é menor
 * (<>>=) verifica se é menor ou igual
 */

    public static void main(String[] args) {
        String nomeUm = "Lucas";
        String nomeDois = new String("Lucas");

        System.out.println(nomeUm.equals(nomeDois)); //utilizar sempre .equals em caso de objetos




        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);
    
        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior do que numeroDois? " + simNao);
    }
}