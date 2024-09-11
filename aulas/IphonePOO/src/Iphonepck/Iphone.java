package Iphonepck;

import Cellphone.Phone;
import InternetNavigate.Internet;
import MusicPlayer.MusicPlayer;

public abstract class Iphone {
    public static void main(String[] args) {

        Internet internet = new Internet();
        internet.exibirPagina("GITHUB.COM/DEVYANK1");


        Phone celular = new Phone();
        celular.ligar("+55 (98) 98711-7793");


        MusicPlayer spotify = new MusicPlayer();
        spotify.tocar("CAR'S OUTSIDE");
        spotify.selecionarMusica("IT WILL RAIN");

    }

}
