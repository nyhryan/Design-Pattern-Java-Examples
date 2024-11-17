package creational.factory_method;

import creational.factory_method.maze.BombedMazeGame;
import creational.factory_method.maze.SimpleMazeGame;

/*
Factory Method Pattern is consisted of...
- Creator / ConcreteCreator
    - Creator: AbstractMazeGame = Has a factory method
    - ConcreteCreator: SimpleMazeGame, BombedMazeGame = Implements factory method
- Product / ConcreteProduct
    - Product: MazeComponent
    - ConcreteProduct: Room, Wall, Door, BombedWall, BombedDoor
 */

public class Main {
    public static void main(String[] args) {
        var maze = SimpleMazeGame.getInstance().CreateMaze();
        maze.print();

        maze = BombedMazeGame.getInstance().CreateMaze();
        maze.print();
    }
}
