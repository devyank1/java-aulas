package OperacoesBasicas2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Compras> compras;

    public CarrinhoDeCompras(){
        this.compras = new ArrayList<>();
    }

    public void adicionarItens(String nome, double preco, int quantidade){
        compras.add(new Compras(nome, preco, quantidade));

    }

    public void removerItens(String nome){
        List<Compras> removerCompras = new ArrayList<>();
        for (Compras b : compras){
            if (b.getNome().equalsIgnoreCase(nome)){
                removerCompras.add(b);
            }
        }
        compras.removeAll(removerCompras);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        for (Compras c : compras){
            valorTotal += c.getPreco() * c.getQuantidade();
        }
        return valorTotal;
    }

    public String exibirItens(){
        return compras.toString();
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItens("Monitor 144Hz", 1499.90, 1);
        carrinhoDeCompras.adicionarItens("Teclado Redragon Kumara", 169.90, 1);
        carrinhoDeCompras.adicionarItens("Mouse Redragon Cobra", 99.99, 1);
        carrinhoDeCompras.adicionarItens("Headset Redrgaon Minos", 139.90, 1);

        System.out.println("Todos os seus itens são: " + carrinhoDeCompras.exibirItens());

        carrinhoDeCompras.removerItens("Monitor 144Hz");

        System.out.println("Agora seus itens são: " + carrinhoDeCompras.exibirItens());

        carrinhoDeCompras.calcularValorTotal();
        System.out.println("Valor total do seu carrinho é de: " + carrinhoDeCompras.calcularValorTotal());

    }
}
