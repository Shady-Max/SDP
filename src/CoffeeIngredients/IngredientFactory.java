package CoffeeIngredients;

/**
 * Abstract factory interface for creating various ingredients for a coffee.
 * Concrete factories implementing this interface will provide specific
 * types of milk, syrup, and additives based on the type of coffee selected.
 */
public interface IngredientFactory {
    /**
     * Returns a default milk ingredient for the selected coffee type.
     *
     * @return A Milk object representing the default milk for the selected coffee type.
     */
    Milk getMilk();

    /**
     * Returns a default syrup ingredient for the selected coffee type.
     *
     * @return A Syrup object representing the default syrup for the selected coffee type.
     */
    Syrup getSyrup();

    /**
     * Returns a default additive ingredient for the selected coffee type.
     *
     * @return An Additive object representing the default additive for the selected coffee type.
     */
    Additive getAdditive();
}
