package Heranca.mains;

import Heranca.animais.Cachorro;
import Heranca.animais.Dragao;
import Heranca.animais.Gato;
import Heranca.animais.Pombo;

public class Main {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro("CARAMELO");


        caramelo.lamber();
        caramelo.latir();
        caramelo.beber();
        caramelo.comer();



        Gato samisan = new Gato("GATINHO");

        samisan.comer();
        samisan.miar();
        samisan.beber();



        Pombo pombo = new Pombo("POMBINHO CARTEIRO");

        pombo.pru();
        pombo.enviarCarta();
        pombo.beber();
        pombo.comer();
        pombo.voar();



        Dragao banguela = new Dragao("BANGUELA");
        banguela.beber();
        banguela.comer();
        banguela.voar();
        banguela.soltarFogo();
    }
}
