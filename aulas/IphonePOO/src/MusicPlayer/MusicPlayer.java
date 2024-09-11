package MusicPlayer;

import Iphonepck.Iphone;

public class MusicPlayer extends Iphone {


    private String musica;
    private String trocarMusica;

    public void tocar(String musica){
        System.out.println("ESTÁ TOCANDO AGORA:  " + musica);
        pausar();
        play();
    }

    private void pausar(){
        System.out.println("MÚSICA PAUSADA");
    }

    public void selecionarMusica(String trocarMusica){
        System.out.println("SELECIONANDO A MÚSICA: "  + trocarMusica);
    }

    private void play(){
        System.out.println("TOCANDO AGORA");
    }
}
