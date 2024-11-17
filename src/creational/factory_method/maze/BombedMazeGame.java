package creational.factory_method.maze;

import creational.factory_method.maze.component.*;

import java.util.Random;

public class BombedMazeGame extends AbstractMazeGame {
    private static class LazyHolder {
        public static final BombedMazeGame INSTANCE = new BombedMazeGame();
    }

    public static BombedMazeGame getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static final Random rand = new Random();

    // Subclasses have responsibility to instantiate the components
    @Override
    Room makeRoom(int roomNumber) {
        return new Room(roomNumber);
    }

    @Override
    Door makeDoor(Room room1, Room room2) {
        // returns bombed door by 33% chance
        var n = rand.nextInt(1, 101);
        if (n <= 33) {
            return new BombedDoor(room1, room2);
        }
        return new Door(room1, room2);
    }

    @Override
    Wall makeWall() {
        // returns bombed wall by 33% chance
        var n = rand.nextInt(1, 101);
        if (n <= 33) {
            return new BombedWall();
        }
        return new Wall();
    }
}
