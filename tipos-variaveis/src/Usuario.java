public class Usuario {
    public static void main(String[] args) {
        SmarTv smartv = new SmarTv();

        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.aumentarVolume();

        smartv.mudarCanal(14);
        
        System.out.println("TV Ligada? "+smartv.ligada);
        System.out.println("Qual canal atual? "+smartv.canal);
        System.out.println("Em que volume está? "+smartv.volume);

        smartv.ligar();
        System.out.println("Novo Status: TV Ligada? "+smartv.ligada);

        smartv.desligar();
        System.out.println("Novo Status: TV Ligada? "+smartv.ligada);
    }
       
        
}
