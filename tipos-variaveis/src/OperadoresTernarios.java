public class OperadoresTernarios {
/*
 * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
 * if(a==b)
 *      resultado = "verdadeiro";
 * else
 *      resultado = "falso";
 * 
 */
    public static void main(String[] args) {
        int aa, ba; 
        
        aa = 8;
        ba = 8;

        String resultado = "";
        if(aa==ba)
            resultado = "verdadeiro";
         else
            resultado = "falso";

        System.out.println(resultado);

        //OPERADOR TERNÁRIO

        int a, b;

        a = 5;
        b = 6;

        String resultado1 = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado1);
    }



}