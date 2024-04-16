import java.util.ArrayList;
import java.util.List;

class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private AnimalFactory factory = new AnimalFactory();

    public void addAnimal(String type) {
       //TODO: add an animal to animals list by using the Factory Method.
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void feedAllAnimals() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}
