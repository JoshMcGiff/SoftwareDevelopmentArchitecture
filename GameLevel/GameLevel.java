/**
 * This class is part of the Game Level exercise.
 * Ownership and Copyright Notice:
 * Owned by Josh McGiff, Lecturer at University of Limerick (UL).
 */

import java.util.ArrayList;
import java.util.List;

public class GameLevel {
    private List<Enemy> enemies = new ArrayList<>();

    public GameLevel(String levelType, Difficulty gameDifficulty) {
        // TODO: Create a variable called amountOfEnemies and set it = 5
        // TODO: If levelType is "castle" -> then if Difficulty is EASY set difficulty = 3
        //                              if Difficulty is HARD set difficulty = 10
        //                              otherwise keep it as is.
        //      then add X enemies of type Wizard to the enemies list (where x = amountOfEnemies)
        // TODO: If levelType is "cave" -> then add X enemies of type Dragon to the enemies list (where x = amountOfEnemies)
    }

    public void startLevel() {
        enemies.forEach(enemy -> {
            enemy.speak();
            enemy.attack();
        });
    }
}
