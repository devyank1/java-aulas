package AbstractLkd;

public class Aluno extends Pessoa{

    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public void mostrarDados() {
        System.out.println("SOU ALUNO");
    }

    @Override
    public void testarDados() {
        super.testarDados();
    }
}
