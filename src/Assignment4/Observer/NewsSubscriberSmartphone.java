package Assignment4.Observer;

/**
 * Concrete observer that represents a smartphone device.
 * It subscribes to news in the 'Sports' category.
 */
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Sports")) {
            System.out.println("Smartphone: News in 'Sports': " + news);
        }
    }
}
