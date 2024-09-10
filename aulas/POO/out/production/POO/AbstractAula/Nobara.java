package AbstractAula;

public class Nobara extends Feiticeiro{

    private String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public void expandirDominio() {
        super.expandirDominio();
        System.out.println("SEM EXPANSÃO DE DOMINIO");
    }

    @Override
    public void classeFeiticeiro() {
        System.out.println("CLASSE A");
    }
}
