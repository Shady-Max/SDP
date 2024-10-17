package Assignment4.State;

/**
 * The Player class that operates in different states (Stopped, Playing, Paused).
 */
public class Player {

    private PlayerState state;

    public Player() {
        // Initial state is stopped
        this.state = new StoppedState();
    }

    /**
     * Sets the new state of the player.
     *
     * @param state the new state to be applied to the player.
     */
    public void setState(PlayerState state) {
        this.state = state;
    }

    /**
     * Delegates the play action to the current state.
     */
    public void play() {
        state.play(this);
    }

    /**
     * Delegates the pause action to the current state.
     */
    public void pause() {
        state.pause(this);
    }

    /**
     * Delegates the stop action to the current state.
     */
    public void stop() {
        state.stop(this);
    }

}
