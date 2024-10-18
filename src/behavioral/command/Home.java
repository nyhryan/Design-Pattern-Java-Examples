package behavioral.command;

import behavioral.command.commands.*;
import behavioral.command.home.*;
import behavioral.command.home.devices.*;

// Client
public class Home {
    // Receiver
    private static final Light light = new Light();
    private static final Thermostat thermostat = new Thermostat();
    private static final DoorLock doorLock = new DoorLock();

    // Invoker
    private static final HomeController homeController = new HomeController();

    public static void main(String[] args) {
        // Client can invoke commands without knowing what the command does "internally"
        homeController.setCommand(new ToggleLightCommand(light));
        // Invoke the command
        homeController.pressButton(); // Turns on the light
        homeController.pressButton(); // Turns off the light

        // Try other commands
        homeController.setCommand(new SetThermostatCommand(thermostat, 25.0));
        homeController.pressButton(); // Sets the temperature to 25.0

        homeController.setCommand(new LockDoorCommand(doorLock));
        homeController.pressButton(); // "Locks" the door
        homeController.pressButton(); // "Locks" the door again

        homeController.log();
    }
}

