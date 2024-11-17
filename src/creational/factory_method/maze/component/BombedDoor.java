package creational.factory_method.maze.component;

public class BombedDoor extends Door {
    public BombedDoor(Room room1, Room room2) {
        super(room1, room2);
    }

    @Override
    public void enter() {
        System.out.println("Entered BOMED DOOR!! HAHAHAH");
    }

    @Override
    public String toString() {
        return "BombedDoor";
    }
}
