/**
 * This class is part of the Game Level exercise.
 * Ownership and Copyright Notice:
 * Owned by Josh McGiff, Lecturer at University of Limerick (UL).
 */
public class Wizard implements Enemy{

    public void attack() {
        System.out.println("Wizard attacks with a might spell!");
    }
    public void defend() {
        System.out.println("Wizard defends with a force field!");
    }
    public void speak() {
        System.out.println("Wizard says: 'You're a wizard, Harry!'");
    }
}
