package creational.factory_method.maze;

import creational.factory_method.maze.component.Door;
import creational.factory_method.maze.component.Maze;
import creational.factory_method.maze.component.Room;
import creational.factory_method.maze.component.Wall;

public class SimpleMazeGame extends AbstractMazeGame {
    private static class LazyHolder {
        public static final SimpleMazeGame INSTANCE = new SimpleMazeGame();
    }

    public static SimpleMazeGame getInstance() {
        return LazyHolder.INSTANCE;
    }

    // Subclasses have responsibility to instantiate the components
    @Override
    Room makeRoom(int roomNumber) {
        return new Room(roomNumber);
    }

    @Override
    Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }

    @Override
    Wall makeWall() {
        return new Wall();
    }
}
