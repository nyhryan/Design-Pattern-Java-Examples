package behavioral.command.home;

import behavioral.command.commands.ICommand;

import java.util.ArrayDeque;
import java.util.Deque;

// Invoker
public class HomeController {
    private ICommand command;
    private final Deque<ICommand> commandHistory = new ArrayDeque<>();

    // Set the command to be executed
    public void setCommand(ICommand command) {
        this.command = command;
    }

    // Save history and execute the command
    public void pressButton() {
        commandHistory.push(command);
        command.execute();
    }

    // See the history of commands
    public void log() {
        System.out.println("---- Command history stack ----");
        commandHistory.forEach(System.out::println);
    }
}
