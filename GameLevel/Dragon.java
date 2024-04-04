/**
 * This class is part of the Game Level exercise.
 * Ownership and Copyright Notice:
 * Owned by Josh McGiff, Lecturer at University of Limerick (UL).
 */

public class Dragon implements Enemy{
    public void attack() {
        System.out.println("Dragon attacks by breathing fire!");
    }
    public void defend() {
        System.out.println("Dragon defends itself with its wings!");
    }
    public void speak() {
        System.out.println("Dragon speaks with a loud roar!");
    }
}
