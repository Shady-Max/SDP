package Assignment3.Command;

/**
 * Command class to turn on the television.
 * This is a concrete implementation of the Command interface.
 */
public class TurnOnCommand implements Command {
    private Television television;

    public TurnOnCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.turnOn();
    }
}
