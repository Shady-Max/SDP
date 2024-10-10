package Assignment3.Command;

/**
 * Command class to raise the television volume.
 * This is a concrete implementation of the Command interface.
 */
public class VolumeUpCommand implements Command {
    private Television television;

    public VolumeUpCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.volumeUp();
    }
}
