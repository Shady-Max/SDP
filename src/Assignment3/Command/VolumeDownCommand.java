package Assignment3.Command;

/**
 * Command class to lower the television volume.
 * This is a concrete implementation of the Command interface.
 */
public class VolumeDownCommand implements Command {
    private Television television;

    public VolumeDownCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.volumeDown();
    }
}
