package exercicio3;

public class AppAnimal {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();

        animais[0].emitirSom();
        animais[1].emitirSom();
        animais[2].emitirSom();

        comerAnimal(animais[0]);
        comerAnimal(animais[2]);

    }

    public static void comerAnimal(Animal animal) {
        if(animal instanceof Carnivoro) {
            ((Carnivoro) animal).comerCarne();
        } else {
            ((Herbivoro) animal).comerPasto();
        }
    }

}
