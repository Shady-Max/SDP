package CoffeeTypes;

import CoffeeIngredients.CappuccinoIngredientFactory;
import CoffeeIngredients.EspressoIngredientFactory;
import CoffeeIngredients.IngredientFactory;

/**
 * Factory class for creating different types of Coffee and IngredientFactory objects.
 * This class uses the Factory Method pattern to create instances of Coffee based on the type provided.
 * It also uses the Abstract Factory pattern to return the appropriate IngredientFactory
 * based on the type of coffee selected.
 */
public class CoffeeFactory {
    /**
     * Creates a Coffee object based on the specified coffee type.
     *
     * @param type The type of coffee to create (e.g., "Espresso", "Cappuccino").
     * @return A Coffee object representing the selected coffee type.
     * @throws IllegalArgumentException If an invalid coffee type is provided.
     */
    public static Coffee createCoffee(String type) {
        return switch (type) {
            case "Espresso" -> new Espresso();
            case "Cappuccino" -> new Cappuccino();
            default -> throw new IllegalArgumentException("Invalid coffee type");
        };
    }

    /**
     * Returns an IngredientFactory based on the specified coffee type.
     * The factory provides default ingredients for the selected coffee.
     *
     * @param type The type of coffee for which to get the ingredient factory (e.g., "Espresso", "Cappuccino").
     * @return An IngredientFactory providing default ingredients for the selected coffee type.
     * @throws IllegalArgumentException If an invalid coffee type is provided.
     */
    public static IngredientFactory getIngredientFactory(String type) {
        return switch (type) {
            case "Espresso" -> new EspressoIngredientFactory();
            case "Cappuccino" -> new CappuccinoIngredientFactory();
            default -> throw new IllegalArgumentException("Invalid coffee type");
        };
    }
}
