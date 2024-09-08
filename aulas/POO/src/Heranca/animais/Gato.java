package Heranca.animais;

import Heranca.mains.Animal;

public class Gato extends Animal {

    private String nome;

    public Gato(String nome){
        super(nome);
    }

    public void miar() {
        System.out.println(getNome() + " MIAAAAU");
    }

}

