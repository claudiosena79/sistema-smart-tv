public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual o canal: " + smartTv.canal);
        System.out.println("Qual o volume: " + smartTv.volume);

        smartTv.ligar();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual o volume: " + smartTv.volume);

        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.mudarCanal(0);
        smartTv.diminuirCanal();

    }
}
