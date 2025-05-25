public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(14);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - Tv ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status - Tv desligada: " + smartTv.ligada);

    }
    
}
