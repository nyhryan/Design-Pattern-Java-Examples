package creational.factory_method.maze;

import creational.factory_method.maze.component.*;

public abstract class AbstractMazeGame {
    // This is "Template Method"
    public Maze CreateMaze() {
        var maze = MakeMaze();

        var room1 = makeRoom(1);
        var room2 = makeRoom(2);
        var door = makeDoor(room1, room2);

        /*
              w          w
          w room1 DOOR room2 w
              w          w
        */

        room1.setSide(Direction.NORTH, makeWall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, makeWall());
        room1.setSide(Direction.WEST, makeWall());

        room2.setSide(Direction.NORTH, makeWall());
        room2.setSide(Direction.EAST, makeWall());
        room2.setSide(Direction.SOUTH, makeWall());
        room2.setSide(Direction.WEST, door);

        maze.addRooms(room1, room2);
        return maze;
    }

    // These are "Factory Methods"
    protected Maze MakeMaze() {
        return new Maze();
    }
    abstract Room makeRoom(int roomNumber);
    abstract Door makeDoor(Room room1, Room room2);
    abstract Wall makeWall();
}
