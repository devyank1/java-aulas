package AbstractLkd;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("JOAOZINHO");
        aluno.setIdade(14);

        System.out.println("OLÁ ME CHAMO " + aluno.getNome());
        System.out.println("E TENHO " + aluno.getIdade() + " ANOS");
        aluno.mostrarDados();


        Professor professor = new Professor();

        professor.setNome("ANTONIO");
        professor.setIdade(33);

        System.out.println("OLÁ ME CHAMO " + professor.getNome());
        System.out.println("E TENHO " + professor.getIdade() + " ANOS");
        professor.mostrarDados();

    }
}
