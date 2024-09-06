package edu.yan.anatomy2;
public class MyClass {

    public static void main(String[] args) {
        String primeiroNome = "Yan";
        String segundoNome = "Carlos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}