package behavioral.command_pattern.commands;

import behavioral.command_pattern.home.devices.Thermostat;

public class SetThermostatCommand implements ICommand {
    private final Thermostat thermostat;
    private final double newTemperature;
    private final double oldTemperature;

    public SetThermostatCommand(Thermostat thermostat, double newTemperature) {
        this.thermostat = thermostat;
        this.newTemperature = newTemperature;
        this.oldTemperature = thermostat.getTemperature();
    }

    @Override
    public void execute() {
        System.out.print("From " + oldTemperature + " -> ");
        thermostat.setTemperature(newTemperature);
    }
}
