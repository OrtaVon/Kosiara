package kosiara.model;

import java.util.Random;

public class SimpleGameWorldFactory implements GameWorldFactory {

    private Position bottomRight;

    @Override
    public GameWorld newGameWorld() {

        bottomRight = new Position(9, 9);

        GameWorld gameWorld = new GameWorld(new Position(0, 0), bottomRight);

        Random random = new Random();

        int grassCount = 99;

        for (int i = 0; i < grassCount; i++) {
            int x = random.nextInt(9);
            int y = random.nextInt(9);
            Position position = new Position(x, y);
            gameWorld.getEntities().put(position, new Grass(position));
        }

        return gameWorld;
    }
}
