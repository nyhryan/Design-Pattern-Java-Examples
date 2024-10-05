package behavioral.command_pattern.home.devices;

public class DoorLock {
    private boolean isLocked = false;

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        if (isLocked) {
            System.out.println("Door is already locked");
            return;
        }
        isLocked = true;
        System.out.println("Door is locked");
    }

    public void unlock() {
        if (!isLocked) {
            System.out.println("Door is already unlocked");
            return;
        }
        isLocked = false;
        System.out.println("Door is unlocked");
    }
}
