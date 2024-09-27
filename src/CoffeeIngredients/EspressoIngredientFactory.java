package CoffeeIngredients;
import CoffeeIngredients.Ingredients.NoMilk;
import CoffeeIngredients.Ingredients.Sugar;
import CoffeeIngredients.Ingredients.VanillaSyrup;

/**
 * Concrete implementation of the IngredientFactory interface for Espresso.
 * This factory provides default ingredients typically used in Espresso.
 */
public class EspressoIngredientFactory implements IngredientFactory{
    @Override
    public Milk getMilk() {
        return new NoMilk(); // Espresso typically has no milk by default.
    }

    @Override
    public Syrup getSyrup() {
        return new VanillaSyrup(); // Default syrup option for Espresso.
    }

    @Override
    public Additive getAdditive() {
        return new Sugar(); // Default additive option for Espresso.
    }
}
