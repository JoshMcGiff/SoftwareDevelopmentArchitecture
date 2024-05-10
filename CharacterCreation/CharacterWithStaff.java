public class CharacterWithStaff extends Character {
    public CharacterWithStaff(String name) {
        super(name);
        this.power += 15;  // Increase power for Staff
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " wielding a magical staff 🪄";
    }
}