/**
 * This class is part of the Reactor Management exercise.
 *
 * Ownership and Copyright Notice:
 * Owned by Josh McGiff, Lecturer at University of Limerick (UL).
 */

public class Main {
    public static void main(String[] args) {
        // See what happens when you run this!
        NuclearReactorControlSystem controlSystem = new NuclearReactorControlSystem();
        controlSystem.IncreaseOutputEnergy();
        controlSystem.IncreaseCooling();
        controlSystem.DisplayReactors();
    }
}