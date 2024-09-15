package Set4;

public class Tarefa {

    private String descricao;
    private boolean concluida;


    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(){
        this.descricao = descricao;
    }

    public boolean isConcluida(boolean concluida){
        return concluida;
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefas: " + descricao + " está concluído? " + concluida;
    }

    public boolean isConcluida() {
        return concluida;
    }
}
