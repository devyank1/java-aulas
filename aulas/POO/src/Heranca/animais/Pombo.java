package Heranca.animais;

import Heranca.mains.Animal;

public class Pombo extends Animal {

    private String nome;

    public Pombo(String nome){
        super(nome);
    }

    public void pru(){
        System.out.println(getNome() + " PRU PRU PRU");
    }

    public void enviarCarta(){
        System.out.println(getNome() + " FOI ENTREGAR A CARTINHA");
    }
}
