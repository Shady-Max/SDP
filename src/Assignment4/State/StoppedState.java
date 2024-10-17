package Assignment4.State;

/**
 * Represents the stopped state of the player.
 */
public class StoppedState implements PlayerState{
    @Override
    public void play(Player player) {
        System.out.println("Starting playback from the beginning.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Can't pause. The player is stopped.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Already stopped.");
    }
}
