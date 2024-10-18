package behavioral.command.home.devices;

public class Light {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        if (isOn) {
            System.out.println("Light is already on");
            return;
        }
        isOn = true;
        System.out.println("Light is on");
    }

    public void off() {
        if (!isOn) {
            System.out.println("Light is already off");
            return;
        }
        isOn = false;
        System.out.println("Light is off");
    }
}
