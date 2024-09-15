package Set1;

import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidados> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidados convidadoParaRemover = null;

        for( Convidados c : convidadosSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirListaConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("EXISTEM " + conjuntoConvidados.contarConvidados() + " CONVIDADO(S) DENTRO DO SET DE CONVIDADOS.");

        conjuntoConvidados.adicionarConvidado("CONVIDADO 1", 1234);
        conjuntoConvidados.adicionarConvidado("CONVIDADO 1", 1235);
        conjuntoConvidados.adicionarConvidado("CONVIDADO 1", 1235);
        conjuntoConvidados.adicionarConvidado("CONVIDADO 1", 1236);

        System.out.println("EXISTEM " + conjuntoConvidados.contarConvidados() + " CONVIDADO(S) DENTRO DO SET DE CONVIDADOS");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("EXISTEM " + conjuntoConvidados.contarConvidados() + " CONVIDADO(S) DENTRO DO SET DE CONVIDADOS.");

        conjuntoConvidados.exibirListaConvidados();
    }
}
