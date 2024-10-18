package behavioral.command.commands;

import behavioral.command.home.devices.DoorLock;

public class LockDoorCommand implements ICommand {
    private final DoorLock doorLock;
    private final boolean doorLockState;

    public LockDoorCommand(DoorLock doorLock) {
        this.doorLock = doorLock;
        this.doorLockState = doorLock.isLocked();
    }

    @Override
    public void execute() {
        System.out.print("From " + (doorLockState ? "locked" : "unlocked") + " -> ");
        doorLock.lock();
    }
}
