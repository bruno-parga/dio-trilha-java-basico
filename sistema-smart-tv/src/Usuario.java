public class Usuario {
    public static void main(String[] args) {
        //teste git
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(44);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status - TV ligada? " + smartTv.ligada);
    }
}