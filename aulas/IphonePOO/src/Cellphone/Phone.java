package Cellphone;

import Iphonepck.Iphone;

public class Phone extends Iphone {


    private String numero;

    public void ligar(String numero){
        System.out.println("LIGANDO PARA O NÚMERO: " + numero);
        atender();
        iniciarCorreioVoz();
    }

    public void atender(){
        System.out.println("LIGAÇÃO ATENDIDA");
    }

    public void iniciarCorreioVoz(){
        System.out.println("LIGAÇÃO NA CAIXA POSTAL");
    }

}
