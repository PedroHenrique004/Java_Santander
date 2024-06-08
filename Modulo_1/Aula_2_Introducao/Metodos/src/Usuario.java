
public class Usuario {

    
    
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Agora ela está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Agora ela está ligada? " + smartTv.ligada);
    }
}
