package exercicio3;

public class Vaca extends Animal implements Herbivoro{
    @Override
    public void emitirSom() {
        System.out.println("muuu");
    }

    @Override
    public void comerPasto() {
        System.out.println("Vaca comendo grama");
    }
}
