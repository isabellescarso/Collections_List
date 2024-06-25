package Livro;

public class Livro {
///atributos
private String titulo;
private String autor;
private int anoPublicacao;

public Livro(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
}

public String getTitulo() {
    return titulo;
}

public String getAutor() {
    return autor;
}

public int getAnoPublicacao() {
    return anoPublicacao;
}

@Override
public String toString() {
    return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
}

public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
    catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
    catalogoLivros.adicionarLivro("Livro 2", "Autor 3", 2022);
    catalogoLivros.adicionarLivro("Livro 3", "Autor 4", 2023);
    catalogoLivros.adicionarLivro("Livro 4", "Autor 5", 1994);

    System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
    System.out.println("-------------------------------------------");
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2023));
    System.out.println("-------------------------------------------");
    System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
}


}
