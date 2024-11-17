package creational.factory_method.maze.component;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    private final List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addRooms(Room... rooms) {
        this.rooms.addAll(List.of(rooms));
    }

    public void print() {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }
}
