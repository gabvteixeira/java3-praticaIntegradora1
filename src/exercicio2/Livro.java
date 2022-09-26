package exercicio2;

public class Livro extends Documento{
    private int numeroPaginas;
    private String nomeAutor, titulo, genero;

    public Livro(int numeroPaginas, String nomeAutor, String titulo, String genero) {
        this.numeroPaginas = numeroPaginas;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public String toString() {
        return "Livro, titulo: " + this.titulo;
    }
}
