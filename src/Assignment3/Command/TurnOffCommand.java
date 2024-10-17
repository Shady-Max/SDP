package Assignment3.Command;

/**
 * Command class to turn off the television.
 * This is a concrete implementation of the Command interface.
 */
public class TurnOffCommand implements Command {
    private Television television;

    public TurnOffCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.turnOff();
    }
}
