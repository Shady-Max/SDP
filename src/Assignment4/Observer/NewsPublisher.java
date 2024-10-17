package Assignment4.Observer;

/**
 * Interface representing a News Publisher that manages subscribers (observers).
 */
public interface NewsPublisher {
    /**
     * Method to subscribe a new observer to the publisher.
     *
     * @param observer the observer to be added to the subscription list.
     */
    void subscribe(Observer observer);

    /**
     * Method to unsubscribe an observer from the publisher.
     *
     * @param observer the observer to be removed from the subscription list.
     */
    void unsubscribe(Observer observer);

    /**
     * Method to notify all subscribers when new content is published.
     *
     * @param category the category of the news.
     * @param news the news content to be shared with subscribers.
     */
    void notifySubscribers(String category, String news);
}
