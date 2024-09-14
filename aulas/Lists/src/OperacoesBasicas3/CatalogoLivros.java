package OperacoesBasicas3;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros(){
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if ( !listaLivros.isEmpty() ) {
            for (Livro l  : listaLivros) {
                if ( l.getAutor().equalsIgnoreCase(autor) ){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if ( !listaLivros.isEmpty() ) {
            for (Livro l : listaLivros){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if ( !listaLivros.isEmpty() ){
            for ( Livro l : listaLivros ){
                if ( l.getTitulo().equalsIgnoreCase(titulo) ){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("LIVRO 1", "AUTOR 1", 2020);
        catalogoLivros.adicionarLivro("LIVRO 1", "AUTOR 2", 2021);
        catalogoLivros.adicionarLivro("LIVRO 2", "AUTOR 2", 2022);
        catalogoLivros.adicionarLivro("LIVRO 3", "AUTOR 3", 2023);
        catalogoLivros.adicionarLivro("LIVRO 4", "AUTOR 4", 1994);

        System.out.println(catalogoLivros.pesquisarAutor("AUTOR 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("LIVRO 1"));

    }

}
