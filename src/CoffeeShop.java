/**
 * CoffeeShop class acts as a central place for managing coffee orders.
 * It implements the Singleton pattern to ensure only one instance of CoffeeShop exists.
 */
public class CoffeeShop {

    private static CoffeeShop instance;
    private CoffeeOrder lastOrder;

    /**
     * Private constructor to prevent instantiation from other classes.
     */
    private CoffeeShop() {}

    /**
     * Returns the single instance of the CoffeeShop, creating it if necessary.
     *
     * @return The single instance of the CoffeeShop.
     */
    public static CoffeeShop getInstance() {
        if (instance == null)
            instance = new CoffeeShop();
        return instance;
    }

    /**
     * Accepts and processes a coffee order.
     *
     * @param order The coffee order to be processed.
     */
    public void takeOrder(CoffeeOrder order) {
        lastOrder = order;
        System.out.println("Order received: " + order);
    }

    /**
     * Returns the last processed coffee order.
     *
     * @return The last coffee order.
     */
    public CoffeeOrder getLastOrder() {
        return lastOrder;
    }

}
