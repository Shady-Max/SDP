package Assignment3.Command;

import java.util.HashMap;
import java.util.Map;

/**
 * The RemoteControl class represents the invoker in the Command pattern.
 * It stores a set of commands mapped to actions and allows buttons to be pressed,
 * which trigger corresponding commands.
 */
public class RemoteControl{
    private Map<String, Command> commands = new HashMap<>();

    /**
     * Associates a command with a given action (button press).
     * @param action The action string representing the button.
     * @param command The Command object to execute for that action.
     * @return The RemoteControl instance to allow method chaining.
     */
    public RemoteControl setCommand(String action, Command command) {
        commands.put(action, command);
        return this;
    }

    /**
     * Simulates a button press, which triggers the associated command for the action.
     * @param action The action string representing the button.
     * @return The RemoteControl instance to allow method chaining.
     */
    public RemoteControl buttonPressed(String action) {
        Command command = commands.get(action);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Unknown command");
        }
        return this;
    }
}
