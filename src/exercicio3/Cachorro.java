package exercicio3;

public class Cachorro extends Animal implements Carnivoro{
    @Override
    public void emitirSom() {
        System.out.println("Auau");
    }

    @Override
    public void comerCarne() {
        System.out.println("Cachorro comendo carne");
    }
}
