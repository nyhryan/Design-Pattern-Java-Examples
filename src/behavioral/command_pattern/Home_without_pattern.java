package behavioral.command_pattern;

import behavioral.command_pattern.home.devices.DoorLock;
import behavioral.command_pattern.home.devices.Light;
import behavioral.command_pattern.home.devices.Thermostat;

public class Home_without_pattern {
    private static final Light light = new Light();
    private static final Thermostat thermostat = new Thermostat();
    private static final DoorLock doorLock = new DoorLock();

    public static void main(String[] args) {
        // Client(this class) needs to know how to control each device, tightly coupled = bad
        light.on();
        thermostat.setTemperature(25.0);
        doorLock.lock();
        doorLock.lock();
    }
}
