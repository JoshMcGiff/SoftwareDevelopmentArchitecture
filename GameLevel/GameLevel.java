/**
 * This class is part of the Game Level exercise.
 * Ownership and Copyright Notice:
 * Owned by Josh McGiff, Lecturer at University of Limerick (UL).
 */

import java.util.ArrayList;
import java.util.List;

public class GameLevel {
    private List<Enemy> enemies = new ArrayList<>();
    private Difficulty difficulty;
    private int amountOfEnemies = 5;

    // GameLevel doesn't "know" anything about specific enemy types, thus making it more adaptable to different enemy types.
    // Promotes OCP as for-loop never changes & instantiation code never changes
    // - however, if one was to add a new enemy factory, that would have to be added
    // Any ideas on how to avoid this?
    // Dependency injection
    public GameLevel(String enemyType) {
        // TODO: Create a variable called amountOfEnemies and set it = 5
        // TODO: If enemyType is "wizard" -> then add X enemies of type Wizard to the enemies list (where x = amountOfEnemies)
        // TODO: If levelType is "dragon" -> then add X enemies of type Dragon to the enemies list (where x = amountOfEnemies)
    }

    public void startLevel() {
        int index = 0;
        for (Enemy enemy : enemies) {
            System.out.println("Enemy " + (index + 1) + ":"); // Print index starting from 1
            enemy.speak();
            enemy.attack();
            System.out.println();
            index++;
        }
    }
}
