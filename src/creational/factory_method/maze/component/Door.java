package creational.factory_method.maze.component;

public class Door implements MazeComponent{
    private final Room room1;
    private final Room room2;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void enter() {

    }

    @Override
    public String toString() {
        return "Door";
    }
}
