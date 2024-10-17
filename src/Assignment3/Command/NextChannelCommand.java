package Assignment3.Command;

/**
 * Command class to change the television to the next channel.
 * This is a concrete implementation of the Command interface.
 */
public class NextChannelCommand implements Command {
    private Television television;

    public NextChannelCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.nextChannel();
    }
}
