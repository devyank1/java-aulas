package Heranca.mains;

public class Animal {
    private String nome;
    public Animal(String nome){
        this.nome = nome;
    }

    public void comer(){

        System.out.println(nome + " COMEU");
    }

    public void beber(){

        System.out.println(nome + " BEBEU");
    }

    public void voar(){
        System.out.println(nome + " VOOU");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome =  nome;
    }
}
