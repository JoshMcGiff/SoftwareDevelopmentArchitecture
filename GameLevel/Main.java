/**
 * This class is part of the Game Level exercise.
 * Ownership and Copyright Notice:
 * Owned by Josh McGiff, Lecturer at University of Limerick (UL).
 */

public class Main {
    public static void main(String[] args) {
        GameLevel castleLevel = new GameLevel("wizard");
        castleLevel.startLevel();

        GameLevel caveLevel = new GameLevel("dragon");
        caveLevel.startLevel();
    }
}