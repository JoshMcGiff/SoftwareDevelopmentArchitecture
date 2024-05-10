public class Game {
    public static void main(String[] args) {
        Character gruntKnight = new Character("Simple Grunt");
        Character gruntKnightWithAmour = new CharacterWithArmour("Knight");
        Character gruntKnightWizardWithHat = new CharacterWithWizardHat("Wizard/Knight Crossover");
        Character gruntWizardWithStaff = new CharacterWithStaff("Wizard");

        System.out.println(gruntKnight.getDescription() + " has power " + gruntKnight.getPower());
        System.out.println(gruntKnightWithAmour.getDescription() + " has power " + gruntKnightWithAmour.getPower());
        System.out.println(gruntKnightWizardWithHat.getDescription() + " has power " + gruntKnightWizardWithHat.getPower());
        System.out.println(gruntWizardWithStaff.getDescription() + " has power " + gruntWizardWithStaff.getPower());
    }
}
