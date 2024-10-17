package Assignment4.State;

/**
 * Represents the playing state of the player.
 */
public class PlayingState implements PlayerState {

    @Override
    public void play(Player player) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Pausing playback.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping playback and resetting track.");
        player.setState(new StoppedState());
    }

}
