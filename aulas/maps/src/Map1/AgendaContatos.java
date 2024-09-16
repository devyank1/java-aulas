package Map1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String , Integer> agendaContatoMap;

    public AgendaContatos(){
    this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("Camila", 5665);
        agenda.adicionarContato("Camila Cavalcante", 1111);
        agenda.adicionarContato("Camila DIO", 654987);
        agenda.adicionarContato("Maria Silva", 1111);
        agenda.adicionarContato("Camila", 44444);

        agenda.exibirContatos();

        agenda.removerContato("Maria Silva");
        agenda.exibirContatos();

        System.out.println("O numero é " + agenda.pesquisarPorNome("Camila DIO"));
    }
}
