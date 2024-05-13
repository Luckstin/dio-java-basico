public class OperadoresUnarios {

/*
 * (+) Operador unário de valor positivo;
 * (-) Operador unário de valor negativo: nega um número ou expressão
 * aritmética;
 * (++) Operador unário de incremento de valor: incrementa o valor em 1
 * unidade;
 * (--) Operador unário de decremento de valor: Decrementa o valor em 1
 * unidade;
 * 
 * 
 * 
 */    

 public static void main (String[] args){
        int numero0 = 5;

        numero0 = -numero0;

        System.out.println(numero0);

        numero0 = numero0*-1;

        System.out.println(numero0);

        //INCREMENTO
        int numero = 5;

        //x repetição

        System.out.println(++ numero);

        System.out.println(numero);

        //DECREMENTO

        int numero1 = 5;

        System.out.println(-- numero1);
        System.out.println(numero1);


        //NEGAR BOOLEAN

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

 }




}
