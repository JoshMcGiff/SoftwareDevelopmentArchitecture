/**
 * This class is part of the Reactor Management exercise.
 *
 * Ownership and Copyright Notice:
 * Owned by Josh McGiff, Lecturer at University of Limerick (UL).
 */

public class Main {
    public static void main(String[] args) {

        Reactor myFirstNuclearReactor = new Reactor("🔥 Sketchy Reactor");
        Reactor mySecondNuclearReactor = new Reactor("⚠️ Risky Reactor");
        Reactor myThirdNuclearReactor = new Reactor("🥬 Mako Reactor"); // bonus points if you get the reference

        Reactor[] collectionOfReactors = new Reactor[]{myFirstNuclearReactor, mySecondNuclearReactor, myThirdNuclearReactor};
        NuclearReactorControlSystem reactorSystem = new NuclearReactorControlSystem(collectionOfReactors, "Totally not flawed management system Inc. ✨");

        reactorSystem.DisplayReactors();

        reactorSystem.IncreaseCooling();
        reactorSystem.IncreaseOutputEnergy();

        reactorSystem.DisplayReactors();

        reactorSystem.IncreaseOutputEnergy();
        reactorSystem.DisplayReactors();
    }
}