package CoffeeIngredients.Ingredients;

import CoffeeIngredients.Additive;

public class NoAdditive implements Additive {
    @Override
    public String addAdditive() {
        return "No additive";
    }
}
