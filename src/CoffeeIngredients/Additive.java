package CoffeeIngredients;

/**
 * Interface for representing a type of additive that can be added to a coffee.
 * All specific additive types (e.g., Sugar, Cinnamon) should implement this interface.
 */
public interface Additive {
    /**
     * Adds the additive to the coffee and returns a string representation of it.
     *
     * @return A string describing the type of additive added to the coffee.
     */
    String addAdditive();
}
