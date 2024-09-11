package InternetNavigate;

import Iphonepck.Iphone;

public class Internet extends Iphone {

    private String url;


    public void exibirPagina(String url){
        System.out.println("PÁGINA WEB: " + url);
        adicionarNovaAba();
        atualizarPagina();
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA AO CLICAR");
    }

    public void atualizarPagina(){
        System.out.println("PAGINA NECESSITA SER ATUALIZADA");
    }

}
