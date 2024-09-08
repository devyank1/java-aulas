package Heranca.animais;

import Heranca.mains.Animal;

public class Cachorro extends Animal {

    private String nome;
    public Cachorro(String nome){

        super(nome);
    }


    public void latir(){

        System.out.println(getNome() + " LATIU");
    }

    public void lamber(){

        System.out.println(getNome() + " LAMBEU");
    }
}
