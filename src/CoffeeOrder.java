import CoffeeIngredients.Additive;
import CoffeeIngredients.IngredientFactory;
import CoffeeIngredients.Milk;
import CoffeeIngredients.Syrup;
import CoffeeTypes.Coffee;


/**
 * The CoffeeOrder class represents a coffee order with selected ingredients.
 * This class also supports cloning the order, allowing the customer to repeat or modify an existing order.
 */
public class CoffeeOrder implements Cloneable {
    private final Coffee coffee;
    private final Milk milk;
    private final Syrup syrup;
    private final Additive additive;

    /**
     * Constructs a coffee order using the specified coffee type and ingredient factory.
     * Uses the default ingredients provided by the factory for the specified coffee type.
     *
     * @param coffee The type of coffee for this order.
     * @param ingredientFactory The factory that produces the ingredients for this type of coffee.
     */
    public CoffeeOrder(Coffee coffee, IngredientFactory ingredientFactory) {
        this.coffee = coffee;
        this.milk = ingredientFactory.getMilk();
        this.syrup = ingredientFactory.getSyrup();
        this.additive = ingredientFactory.getAdditive();
    }

    /**
     * Constructs a coffee order using the specified coffee type and ingredient factory.
     * Uses the default ingredients provided by the factory for the specified coffee type.
     * @param coffee The type of coffee for this order.
     * @param milk The type of milk for this order.
     * @param syrup The type of syrup for this order.
     * @param additive The type of additive for this order.
     */
    public CoffeeOrder(Coffee coffee, Milk milk, Syrup syrup, Additive additive) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
        this.additive = additive;
    }

    /**
     * Creates a deep copy of this coffee order, including its ingredients.
     *
     * @return A cloned CoffeeOrder object.
     * @throws CloneNotSupportedException If the object cannot be cloned.
     */
    @Override
    public CoffeeOrder clone() throws CloneNotSupportedException {
        return (CoffeeOrder) super.clone();
    }

    /**
     * Coverts order to string
     * @return string representation of order
     */
    @Override
    public String toString() {
        return coffee.prepare() + " with " +
                milk.addMilk() + ", " +
                syrup.addSyrup() + ", " +
                additive.addAdditive();

    }

    /**
     * Creates a CoffeeBuilder initialized with the current order's ingredients.
     *
     * @return A new CoffeeBuilder instance.
     */
    public CoffeeBuilder toCoffeeBuilder() {
        return new CoffeeBuilder()
                .setCoffee(coffee)
                .addMilk(milk)
                .addSyrup(syrup)
                .addAdditive(additive);
    }

    /**
     * Gets the type of coffee.
     *
     * @return The type of coffee.
     */
    public Coffee getCoffee() {
        return coffee;
    }

    /**
     * Gets the type of milk.
     *
     * @return The type of milk.
     */
    public Milk getMilk() {
        return milk;
    }

    /**
     * Gets the type of syrup.
     *
     * @return The type of syrup.
     */
    public Syrup getSyrup() {
        return syrup;
    }

    /**
     * Gets the type of additive.
     *
     * @return The type of additive.
     */
    public Additive getAdditive() {
        return additive;
    }
}
