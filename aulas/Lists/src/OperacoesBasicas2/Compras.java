package OperacoesBasicas2;

public class Compras {

    private String itens;
    private String nome;
    private double preco;
    private int quantidade;

    //CONSTRUCTOR
    public Compras(String itens){
        this.itens = itens;
    }

    public Compras(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return nome;
    }
}
