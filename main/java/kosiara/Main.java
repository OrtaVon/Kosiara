package kosiara;

import kosiara.model.*;

public class Main {

    public static void main(String[] args) {

        GameWorldFactory gameWorldFactory = new SimpleGameWorldFactory();

        GameWorld gameWorld = gameWorldFactory.newGameWorld();

        gameWorld.render();
    }
}
