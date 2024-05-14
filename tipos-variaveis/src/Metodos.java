public class Metodos {
    /*
     * Métodos são como funções ou rotinas
     * Devem ser nomeados como verbo
     * Seguir o padrão camelCase EX.: lucasPedro
     */
    public static void main(String[] args) {

        public double somar (int num1, int num2){
            //LOGICA - FINALIDADE DO METODO
            return; //finalizar com return;
        }

        public void imprimir(String texto){
            //LOGICA - FINALIDADE DO Métodos
            // AQUI NÃO PRECISA DO RETURN
            //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
        }
        //throws Excpetion : indica que o método pode
        //gerar uma excessão
        public double dividir(int dividendo, int divisor) throws Exception{}

        //este método não pode ser visto por outras classes no projeto
        private void metodoPrivado(){}

        //alguns equívocos estruturais
        //public void validar({
            //este método deveria retornar algum valor
            //no caso boolean(true or false)
        //})
    }
}
