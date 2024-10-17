package Assignment4.Observer;

/**
 * Concrete observer that represents a tablet device.
 * It subscribes to all categories of news without any filter.
 */
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Tablet: News in '" + category + "': " + news);
    }
}
