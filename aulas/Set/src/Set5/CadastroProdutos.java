package Set5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> pesquisaPorNome = new TreeSet<>(produtos);
        return pesquisaPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto("Smartphone", 3807L, 7.660d, 1);
        cadastro.adicionarProduto("Televisão", 3802L, 2.570d, 1);
        cadastro.adicionarProduto("Mouse Gamer", 17339L, 399.0d, 1);
        cadastro.adicionarProduto("Computador Gamer", 479L, 6.260d, 1);

        System.out.println(cadastro.produtos);

        System.out.println(cadastro.exibirProdutosPorNome());

        System.out.println(cadastro.exibirPorPreco());

    }
}
