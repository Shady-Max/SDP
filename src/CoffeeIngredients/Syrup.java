package CoffeeIngredients;

/**
 * Interface for representing a type of syrup that can be added to a coffee.
 * All specific syrup types (e.g., Vanilla, Caramel) should implement this interface.
 */
public interface Syrup {
    /**
     * Adds the syrup to the coffee and returns a string representation of it.
     *
     * @return A string describing the type of syrup added to the coffee.
     */
    String addSyrup();
}
