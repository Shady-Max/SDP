package CoffeeIngredients;

import CoffeeIngredients.Ingredients.CaramelSyrup;
import CoffeeIngredients.Ingredients.Cinnamon;
import CoffeeIngredients.Ingredients.WholeMilk;

/**
 * Concrete implementation of the IngredientFactory interface for Cappuccino.
 * This factory provides default ingredients typically used in Cappuccino.
 */
public class CappuccinoIngredientFactory implements IngredientFactory{
    @Override
    public Milk getMilk() {
        return new WholeMilk(); // Default milk for Cappuccino is Whole Milk.
    }

    @Override
    public Syrup getSyrup() {
        return new CaramelSyrup(); // Default syrup for Cappuccino is Caramel Syrup.
    }

    @Override
    public Additive getAdditive() {
        return new Cinnamon(); // Default additive for Cappuccino is Cinnamon.
    }
}
