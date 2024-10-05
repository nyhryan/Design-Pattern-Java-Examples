package behavioral.command_pattern.commands;

import behavioral.command_pattern.home.devices.Light;

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
