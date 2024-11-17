package creational.factory_method.maze.component;

public class Room implements MazeComponent {
    private final MazeComponent[] sides = new MazeComponent[4];
    private final int roomNumber;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setSide(Direction direction, MazeComponent component) {
        sides[direction.ordinal()] = component;
    }

    public MazeComponent getSide(Direction direction) {
        return sides[direction.ordinal()];
    }

    @Override
    public void enter() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sides[Direction.WEST.ordinal()])
                .append(" ")
                .append("Room ")
                .append(roomNumber)
                .append(" ")
                .append(sides[Direction.EAST.ordinal()]);

        // Get amount of space till the word Room

        int space = sb.indexOf("Room");
        sb.insert(0, " ".repeat(space) + sides[Direction.NORTH.ordinal()] + "\n");
        sb.append("\n")
                .append(" ".repeat(space))
                .append(sides[Direction.SOUTH.ordinal()])
                .append("\n");

        return sb.toString();
    }
}
