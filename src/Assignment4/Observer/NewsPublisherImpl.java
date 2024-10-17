package Assignment4.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the NewsPublisher interface.
 * Manages a list of subscribers and notifies them when news is published.
 */
public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String category, String news) {
        for (Observer subscriber : subscribers) {
            subscriber.update(category, news);
        }
    }

    /**
     * Helper method to publish news to all subscribers.
     *
     * @param category the category of the news.
     * @param news the news content to be published.
     */
    public void publishNews(String category, String news) {
        System.out.println("Publishing news in category: " + category + " - " + news);
        notifySubscribers(category, news);
    }
}
