package Assignment4.Observer;

/**
 * Observer interface, representing a subscriber that can be notified by the publisher.
 */
public interface Observer {
    /**
     * Method to be called when the publisher notifies the subscriber.
     *
     * @param category the category of the news.
     * @param news the news content.
     */
    void update(String category, String news);
}
