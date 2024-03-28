/**
 * This class is part of the Reactor Management exercise.
 *
 * Ownership and Copyright Notice:
 * Owned by Josh McGiff, Lecturer at University of Limerick (UL).
 */

public class Reactor {
    private final String name;
    private float energyOutput;

    private float coolingAmount;

    public Reactor(String name) {
        this.name = name;
    }

    public void SetEnergyOutput(float energyOutputIn) {
        this.energyOutput = energyOutputIn;
        CheckForDanger(); // We will check after changing the energy output as well from the reactor class itself to find the issue 🤩 *demonstrative purposes*
    }

    public void SetCooling(float coolingAmountIn) {
        this.coolingAmount = coolingAmountIn;
        CheckForDanger(); // We will check after changing the cooling amount as well from the reactor class itself to find the issue 🤩 *demonstrative purposes*
    }

    public void CheckForDanger() {
        if (this.energyOutput >= 100 && this.coolingAmount < 50) {
            System.out.println("output: " + energyOutput + "  -  cooling: " + coolingAmount);
            System.out.println("System overheating!");
            System.out.println("💥💥💥");
            System.exit(1);
        }
    }

    public String getName() {
        return name;
    }

    public float getEnergyOutput() {
        return energyOutput;
    }

    public float getCoolingAmount() {
        return coolingAmount;
    }

}
