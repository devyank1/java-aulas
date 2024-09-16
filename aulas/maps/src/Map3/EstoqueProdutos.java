package Map3;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        if (!estoqueProdutos.isEmpty()) {
            System.out.println(estoqueProdutos);
        } else {
            System.out.println("Não existem produtos no sistema!");
        }
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto valorMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto valorMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutos.values()) {
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutos.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutos.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoque =  new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(123L, "Papel Higiênico", 2, 15.00);
        estoque.adicionarProduto(132L, "Bucha", 3, 9.00);
        estoque.adicionarProduto(222L, "Nutella", 1, 35.00);

        estoque.exibirProdutos();

        System.out.println(estoque.calcularValorTotalEstoque());

        System.out.println(estoque.valorMaisCaro());

        System.out.println(estoque.valorMaisBarato());

        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
