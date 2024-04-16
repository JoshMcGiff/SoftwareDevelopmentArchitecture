public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal("Lion");
        zoo.addAnimal("Elephant");
        zoo.addAnimal("Penguin");

        System.out.println("Feeding time at the zoo:");
        zoo.feedAllAnimals();

        System.out.println("\nSounds from the zoo:");
        zoo.makeAllSounds();
    }
}