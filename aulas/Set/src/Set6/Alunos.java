package Set6;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos>{
    private String nome;
    private long matricula;
    private double media;

    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public Alunos(String nome, long matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Alunos alunos = (Alunos) a;
        return getMatricula() == alunos.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    public String getNome(){
        return nome;
    }

    public long getMatricula(){
        return matricula;
    }

    public double getMedia(){
        return media;
    }

    @Override
    public String toString() {
        return "GerenciadorAlunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

}

class ComparatorAlunoNota implements Comparator<Alunos>{

    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}