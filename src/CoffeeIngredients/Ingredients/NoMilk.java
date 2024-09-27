package CoffeeIngredients.Ingredients;

import CoffeeIngredients.Milk;

public class NoMilk implements Milk {
    @Override
    public String addMilk() {
        return "No milk";
    }
}
