package creational.factory_method.maze.component;

public class BombedWall extends Wall {
    @Override
    public void enter() {
        System.out.println("Entered BOMBED WALL! HAHAHAAH");
    }

    @Override
    public String toString() {
        return "BombedWall";
    }
}
