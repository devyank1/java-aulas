package Set6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAlunos(String nome, long matricula, double media){
        alunos.add(new Alunos(nome, matricula, media));
    }

    public void removerAlunos(long matricula) {
        Alunos alunosParaRemover = null;

        if (!alunos.isEmpty()) {
            for (Alunos a : alunos) {
                if (a.getMatricula() == matricula) {
                    alunosParaRemover = a;
                    break;
                }
            }
            alunos.remove(alunosParaRemover);
        } else {
            throw new RuntimeException("MATRICULA NAO ENCONTRADA");
        }
        if (alunosParaRemover == null){
            System.out.println("MATRICULA NAO ENCONTRADA");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Alunos> exibirNomeAluno = new TreeSet<>();
        if (!alunos.isEmpty()){
            System.out.println(exibirNomeAluno);
        }else {
            System.out.println("A LISTA ESTÁ VAZIA");
        }
    }

    public Set<Alunos> exibirPorNotas(){
        Set<Alunos> exibirNotas = new TreeSet<>(new ComparatorAlunoNota());
        exibirNotas.addAll(alunos);
        return exibirNotas;
    }

    public int exibirAlunos(){
        return alunos.size();

    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAlunos("Claudia", 12L, 7.5);
        gerenciador.adicionarAlunos("Yan", 34L, 8.9);
        gerenciador.adicionarAlunos("Nicolle", 56L, 10.0);
        gerenciador.adicionarAlunos("Yasmin", 78L, 3.5);

        gerenciador.removerAlunos(12L);

        System.out.println(gerenciador.exibirAlunos());

        gerenciador.exibirAlunosPorNome();
        System.out.println(gerenciador.exibirPorNotas());
    }
    }


