package kosiara.model;

public class Grass implements Entity {

    private final Position position;

    public Grass(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return position;
    }
}
