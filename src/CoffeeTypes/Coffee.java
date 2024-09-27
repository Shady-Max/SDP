package CoffeeTypes;

/**
 * Interface representing a generic type of coffee.
 * All specific coffee types (e.g., Espresso, Cappuccino) should implement this interface.
 */
public interface Coffee {
    /**
     * Prepares the coffee and returns a string representation of it.
     *
     * @return A string describing the type of coffee (e.g., "Espresso", "Cappuccino").
     */
    String prepare();
}
