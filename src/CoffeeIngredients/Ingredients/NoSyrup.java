package CoffeeIngredients.Ingredients;

import CoffeeIngredients.Syrup;

public class NoSyrup implements Syrup {
    @Override
    public String addSyrup() {
        return "No syrup";
    }
}
