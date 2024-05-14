public class SmarTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 12;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Novo canal "+novoCanal);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal++;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumento de volume em 1 ");
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuido o volume em 1 ");
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
    public static void main(String[] args) {
        
    }
}