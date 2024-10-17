package Assignment4.Observer;

/**
 * Concrete observer that represents a laptop device.
 * It subscribes to news in the 'Science' category.
 */
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        if (category.equals("Science")) {
            System.out.println("Laptop: News in 'Science': " + news);
        }
    }
}
