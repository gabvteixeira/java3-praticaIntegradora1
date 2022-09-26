package exercicio2;

import java.util.Arrays;

public class Curriculo extends Documento{
    private String nome;
    private int idade;
    private String[] habilidades;

    public Curriculo(String nome, int idade, String[] habilidades) {
        this.nome = nome;
        this.idade = idade;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculo - " + this.nome + " Idade - " + this.idade + " Habilidades: " + Arrays.toString(this.habilidades);
    }
}
