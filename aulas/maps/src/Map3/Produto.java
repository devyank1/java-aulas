package Map3;

public class Produto {
    private long codigo;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public long getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
