package Assignment4.State;

/**
 * Represents the paused state of the player.
 */
public class PausedState implements PlayerState{
    @Override
    public void play(Player player) {
        System.out.println("Resuming playback.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping playback and resetting track.");
        player.setState(new StoppedState());
    }
}
