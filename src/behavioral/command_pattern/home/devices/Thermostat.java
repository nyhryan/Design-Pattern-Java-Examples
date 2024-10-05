package behavioral.command_pattern.home.devices;

public class Thermostat {
    private double temperature = 24.0;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature);
    }
}
