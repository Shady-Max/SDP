import CoffeeIngredients.Additive;
import CoffeeIngredients.IngredientFactory;
import CoffeeIngredients.Milk;
import CoffeeIngredients.Syrup;
import CoffeeTypes.Coffee;

/**
 * Builder class for constructing a custom coffee order step-by-step.
 * This class allows users to specify different ingredients for their coffee
 * and create a fully customized coffee order.
 */
public class CoffeeBuilder {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;
    private Additive additive;

    /**
     * Sets the type of coffee to be used in the order.
     *
     * @param coffee The Coffee object representing the type of coffee (e.g., Espresso, Cappuccino).
     * @return The current instance of the CoffeeBuilder, allowing for method chaining.
     */
    public CoffeeBuilder setCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    /**
     * Sets the ingredients (milk, syrup, additive) to their default values
     * based on the provided IngredientFactory.
     * This method initializes the ingredients to their default choices
     * for the selected type of coffee.
     *
     * @param ingredientFactory The factory providing default ingredients for the selected coffee type.
     * @return The current instance of the CoffeeBuilder, allowing for method chaining.
     */
    public CoffeeBuilder setIngredients(IngredientFactory ingredientFactory) {
        this.milk = ingredientFactory.getMilk();
        this.syrup = ingredientFactory.getSyrup();
        this.additive = ingredientFactory.getAdditive();
        return this;
    }

    /**
     * Adds or modifies the milk ingredient in the coffee order.
     *
     * @param milk The type of milk to add (e.g., Whole Milk, Soy Milk).
     * @return The current instance of the CoffeeBuilder, allowing for method chaining.
     */
    public CoffeeBuilder addMilk(Milk milk) {
        this.milk = milk;
        return this;
    }

    /**
     * Adds or modifies the syrup ingredient in the coffee order.
     *
     * @param syrup The type of syrup to add (e.g., Vanilla Syrup, Caramel Syrup).
     * @return The current instance of the CoffeeBuilder, allowing for method chaining.
     */
    public CoffeeBuilder addSyrup(Syrup syrup) {
        this.syrup = syrup;
        return this;
    }

    /**
     * Adds or modifies the additive ingredient in the coffee order.
     *
     * @param additive The type of additive to add (e.g., Sugar, Cinnamon).
     * @return The current instance of the CoffeeBuilder, allowing for method chaining.
     */
    public CoffeeBuilder addAdditive(Additive additive) {
        this.additive = additive;
        return this;
    }

    /**
     * Constructs and returns the final CoffeeOrder object with the selected coffee type and ingredients.
     *
     * @return A new CoffeeOrder object with the specified coffee type and ingredients.
     */
    public CoffeeOrder build() {
        return new CoffeeOrder(coffee, milk, syrup, additive);
    }
}
