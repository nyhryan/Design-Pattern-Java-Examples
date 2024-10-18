package behavioral.command.commands;

import behavioral.command.home.devices.Light;

public class ToggleLightCommand implements ICommand {
    private final Light light;
    private final boolean lightState;

    public ToggleLightCommand(Light light) {
        this.light = light;
        this.lightState = light.isOn();
    }

    @Override
    public void execute() {
        System.out.print("From " + (lightState ? "on" : "off") + " -> ");
        if (light.isOn()) {
            light.off();
        } else {
            light.on();
        }
    }
}
