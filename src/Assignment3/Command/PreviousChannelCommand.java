package Assignment3.Command;

/**
 * Command class to change the television to the previous channel.
 * This is a concrete implementation of the Command interface.
 */
public class PreviousChannelCommand implements Command {
    private Television television;

    public PreviousChannelCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.prevChannel();
    }
}
