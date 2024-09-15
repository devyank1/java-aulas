package Set4;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {



    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefas.isEmpty()) {
            for (Tarefa t : tarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefas.remove(tarefaParaRemover);
        }else {
            System.out.println("O CONJUNTO ESTÁ VAZIO");
        }
    }

    public void exibirTarefas(){
        if (!tarefas.isEmpty()){
            System.out.println(tarefas);
        }else {
            System.out.println("NÃO TÊM TAREFAS");
        }
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasFeitas = new HashSet<>();
        for (Tarefa t : tarefas){
            if (t.isConcluida(true)){
                tarefasFeitas.add(t);
            }
        }
        return tarefasFeitas;
    }

    public Set<Tarefa> obterTarefasInconcluidas(){
        Set<Tarefa> tarefasNaoFeitas = new HashSet<>();
        for (Tarefa t : tarefas){
            if (t.isConcluida(false)){
                tarefasNaoFeitas.add(t);
            }
        }
        return tarefasNaoFeitas;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isConcluida()) {
                tarefaParaMarcarComoPendente.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas(){
        if (tarefas.isEmpty()){
            System.out.println("A LISTA DE TAREFAS JA ESTA VAZIA!");
        }else {
            tarefas.clear();
        }
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasInconcluidas());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
    }

