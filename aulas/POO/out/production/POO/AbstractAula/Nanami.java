package AbstractAula;

public class Nanami extends Feiticeiro{

    private String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public void classeFeiticeiro() {
        System.out.println("CLASSE ESPECIAL");
    }

    @Override
    public void expandirDominio() {
        super.expandirDominio();
        System.out.println("SEM EXPANSAO DE DOMINIO");
    }

}
