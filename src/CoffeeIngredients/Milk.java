package CoffeeIngredients;

/**
 * Interface for representing a type of milk that can be added to a coffee.
 * All specific milk types (e.g., Whole Milk, Soy Milk) should implement this interface.
 */
public interface Milk {
    /**
     * Adds the milk to the coffee and returns a string representation of it.
     *
     * @return A string describing the type of milk added to the coffee.
     */
    String addMilk();
}
