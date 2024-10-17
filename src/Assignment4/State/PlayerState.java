package Assignment4.State;

/**
 * Interface representing the various states of the player.
 * Each state (Paused, Playing, Stopped) will provide its own implementation of these methods.
 */
public interface PlayerState {

    /**
     * Triggered when the play action is called on the player.
     *
     * @param player the player object that manages its states.
     */
    void play(Player player);

    /**
     * Triggered when the pause action is called on the player.
     *
     * @param player the player object that manages its states.
     */
    void pause(Player player);

    /**
     * Triggered when the stop action is called on the player.
     *
     * @param player the player object that manages its states.
     */
    void stop(Player player);
}
