public class CharacterWithWizardHat extends Character {
    public CharacterWithWizardHat(String name) {
        super(name);
        this.power += 15;  // Increase power for WizardHat
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " wearing a wizard hat 🧙";
    }
}