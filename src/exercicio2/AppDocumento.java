package exercicio2;

public class AppDocumento {
    public static void main(String[] args) {
        Curriculo c = new Curriculo("Gabriel", 23, new String[]{"Java", "Git"});
        Livro l = new Livro(100, "Emerson", "Java", "Didatico");
        Relatorio r = new Relatorio(1000, "Joana", "Jorge", "lorem ipsu");

        Imprimir.imprimir(c);
        Imprimir.imprimir(l);
        Imprimir.imprimir(r);

    }
}
