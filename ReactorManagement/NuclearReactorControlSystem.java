/**
 * This class is part of the Reactor Management exercise.
 *
 * Ownership and Copyright Notice:
 * Owned by Josh McGiff, Lecturer at University of Limerick (UL).
 */

// this class is responsible for managing all the nuclear reactor in a plant
// note: this class is an extreme example to expose students to an environment prime for specific design patterns.
// therefore, I include a disclaimer to say that there are "bad" design practices within this file for learning purposes.
public class NuclearReactorControlSystem {

    // References to other subsystems of the nuclear plant
    private final Reactor[] reactors;
    private float energyOutput; // how much cooling should be applied to the nuclear reactor
    private float coolingAmount;

    public NuclearReactorControlSystem() {
        // Implement a contructor for the reactor where you:
        //      create a list of 3 Reactors and add them to reactors
        //      set A DEFAULT OF 0 FOR: coolingAmount & energyOutput
        //      update all the reactor's coolingAmount & energyOutput

        // TODO: Complete this section

    }

    public void IncreaseOutputEnergy() {
        System.out.println("Increasing output by the reactors! ⚡ \n");
        this.energyOutput += 50; // energyOutput += 1;
        CheckForDanger();
        for (Reactor reactorElement : reactors) {
            reactorElement.SetEnergyOutput(energyOutput);
        }
    }

    public void IncreaseCooling() {
        System.out.println("Increasing cooling on reactors! ❄️ \n");
        this.coolingAmount += 50; // coolingAmount += 1;
        CheckForDanger();
        for (Reactor reactorElement : reactors) {
            reactorElement.SetCooling(this.coolingAmount);
        }
    }

    public void DisplayReactors() {
        for (Reactor reactorElement : reactors) {
            System.out.println("---" + reactorElement.getName() + "---\n" + "reactor output energy: " + reactorElement.getEnergyOutput()
                    + "\n reactor cooling amount: " + reactorElement.getCoolingAmount());
        }

        System.out.println("\n");
    }

    public void CheckForDanger() {
        if (this.energyOutput >= 100 && this.coolingAmount < 50) {
            System.out.println("output: " + energyOutput + "  -  cooling:" + coolingAmount);
            System.out.println("System overheating!");
            System.out.println("💥💥💥");
            System.exit(1);
        }
    }
}
