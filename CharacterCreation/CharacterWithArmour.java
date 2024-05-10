public class CharacterWithArmour extends Character {
    public CharacterWithArmour(String name) {
        super(name);
        this.power += 20;  // Increase power for armour
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " wearing Armor";
    }
}