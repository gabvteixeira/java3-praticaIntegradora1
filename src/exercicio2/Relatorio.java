package exercicio2;

public class Relatorio extends Documento{
    private int nPaginas;
    private String autor, revisor, texto;

    public Relatorio(int nPaginas, String autor, String revisor, String texto) {
        this.nPaginas = nPaginas;
        this.autor = autor;
        this.revisor = revisor;
        this.texto = texto;
    }

    public String toString() {
        return "Relatorio, autor - " + this.autor;
    }
}
