import java.util.Scanner;

public class SmartTv {

    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    Scanner leitor = new Scanner(System.in);

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume += 5;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume -= 5;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);

    }

    public void mudarCanal(int novocanal) {
        System.out.println("Qual o novo canal?");
        novocanal = leitor.nextInt();
        System.out.println("Mudando o canal para: " + novocanal);
        canal = novocanal;

    }

}
