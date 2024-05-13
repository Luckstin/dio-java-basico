public class OperadoresLogicos {

    /*
     * && = E
     * ||"pipes" = OU
     * 
     * 
     */

     public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && (7 > 9 )){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma condiç é verdadeira");
        }
        System.out.println("FIM");

     }
}
