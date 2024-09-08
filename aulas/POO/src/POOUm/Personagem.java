package POOUm;

public class Personagem {
    String nome;
    String classe;
    int forca;
    String expansao;

    void mostrarStatus(){
        System.out.println("Personagem: " + nome + " Level " + forca + " de classe " + classe);
    }

    void expansaoDominio(){
        System.out.println("Expansão de Domínio: " + expansao);
    }
}
