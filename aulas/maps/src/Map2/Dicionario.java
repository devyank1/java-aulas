package Map2;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private String palavra;
    private String definicao;


    private Map<String , String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionario.isEmpty()){
            dicionario.remove(palavra);
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionario.get(palavra);
        if (definicao != null){
            return definicao;
        }
        return "PALAVRA E DEFINICAO NAO ENCOTRADOS NO SISTEMA!";
    }

    public void exibirPalavras(){
       if (!dicionario.isEmpty()){
           System.out.println(dicionario);
       } else {
           System.out.println("O DICIONARIO ESTA VAZIO");
       }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("Sorriso", "expressão facial em que os lábios se distendem para os lados e os cantos da boca se elevam ligeiramente");
        dicionario.adicionarPalavra("Amor", "com o sentido de amizade, afeição, desejo intenso.");
        dicionario.adicionarPalavra("Festa", "reunião de pessoas com fins recreativos, ger. acompanhada de música, dança, bebidas e comidas.");
        dicionario.adicionarPalavra("Coração", "órgão muscular oco dos vertebrados, na cavidade torácica, que recebe o sangue das veias e o impulsiona para dentro das artérias");

        dicionario.removerPalavra("Festa");

        dicionario.pesquisarPorPalavra("Sorriso");

        dicionario.exibirPalavras();
    }
}
