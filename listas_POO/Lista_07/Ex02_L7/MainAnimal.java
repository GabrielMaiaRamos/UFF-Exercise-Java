package listas_POO.Lista_07.Ex02_L7;

public class MainAnimal {
    public static void main(String[] args) {
        Animal[] vetAnimals = new Animal[3];
        vetAnimals[0] = new Homem();
        vetAnimals[1] = new Cao();
        vetAnimals[2] = new Gato();

        for (Animal a : vetAnimals) {
            System.out.println(a.fala());
        }
    }
}