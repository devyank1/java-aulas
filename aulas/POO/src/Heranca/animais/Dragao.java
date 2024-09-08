package Heranca.animais;

import Heranca.mains.Animal;

public class Dragao extends Animal {

    private String nome;

    public Dragao(String nome){
        super(nome);
    }

    public void soltarFogo() {
        System.out.println(getNome() + " CUSPIU FOGO");
    }

}
