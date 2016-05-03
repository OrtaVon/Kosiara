package kosiara.model;

import java.util.HashMap;
import java.util.Map;

public class GameWorld {

    private final Position topLeft;

    private final Position bottomRight;

    private final Map<Position, Entity> entities;

    public GameWorld(Position topLeft, Position bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.entities = new HashMap<>();
    }

    public void render() {

        for (int y = topLeft.getY(); y < bottomRight.getY(); y++) {
            for (int x = topLeft.getX(); x < bottomRight.getX(); x++) {

                Position curentPoition = new Position(x, y);

                if (entities.containsKey(curentPoition))
                    System.out.print("#\t");
                else
                    System.out.print(".\t");

            }
            System.out.println();
        }
    }

    public Map<Position, Entity> getEntities() {
        return entities;
    }
}
