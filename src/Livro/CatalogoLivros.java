package Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

//atributos
private List<Livro> LivroList;


public CatalogoLivros(){
    this.LivroList = new ArrayList<>();
}

public void adicionarLivro(String titulo, String autor, int anoPublicacao){
LivroList.add(new Livro(titulo, autor, anoPublicacao));
}

public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> livrosPorAutor = new ArrayList<>();
    if(!LivroList.isEmpty()){
        for(Livro l : LivroList){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
            }
        }
    }
    return livrosPorAutor;
}

public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if(!LivroList.isEmpty()){
        for(Livro l : LivroList){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                livrosPorIntervaloAnos.add(l);
            }
        }
}
return livrosPorIntervaloAnos;
}

public Livro pesquisarPorTitulo (String titulo){
    Livro livroPorTitulo = null;
    if(!LivroList.isEmpty()){
        for(Livro l : LivroList){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
            }
        }
    }
    return livroPorTitulo;
}

}
