import CoffeeIngredients.*;
import CoffeeTypes.Coffee;
import CoffeeTypes.CoffeeFactory;

import java.util.Scanner;

/**
 * Main class for the Coffee Shop application. Demonstrates the use of various
 * creational design patterns including Singleton, Factory Method, Abstract Factory,
 * Prototype, and Builder.
 * <p>
 * The application allows users to create, modify, and clone coffee orders
 * with different ingredients and options.
 */

public class Main {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        //Singleton
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        // User selects ingredients
        String CoffeeString = CoffeeSelector.chooseCoffee();
        Coffee coffee = CoffeeFactory.createCoffee(CoffeeString);
        IngredientFactory ingredientFactory = CoffeeFactory.getIngredientFactory(CoffeeString);
        Milk chosenMilk = IngredientSelector.chooseMilk(ingredientFactory.getMilk());
        Syrup chosenSyrup = IngredientSelector.chooseSyrup(ingredientFactory.getSyrup());
        Additive chosenAdditive = IngredientSelector.chooseAdditive(ingredientFactory.getAdditive());

        //Builder
        CoffeeOrder customOrder;
        customOrder = new CoffeeBuilder()
                .setCoffee(coffee)
                .addMilk(chosenMilk)
                .addSyrup(chosenSyrup)
                .addAdditive(chosenAdditive)
                .build();

        // Process order
        coffeeShop.takeOrder(customOrder);

        // Prototype (cloning the order)
        try {
            CoffeeOrder clonedOrder = coffeeShop.getLastOrder().clone();
            System.out.println("Cloned order: " + clonedOrder);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 1 if you want to change some of the ingredients: ");
            try {
                if (Integer.parseInt(scanner.nextLine()) == 1) {
                    chosenMilk = IngredientSelector.chooseMilk(clonedOrder.getMilk());
                    chosenSyrup = IngredientSelector.chooseSyrup(clonedOrder.getSyrup());
                    chosenAdditive = IngredientSelector.chooseAdditive(clonedOrder.getAdditive());
                    clonedOrder = clonedOrder.toCoffeeBuilder()
                            .addMilk(chosenMilk)
                            .addSyrup(chosenSyrup)
                            .addAdditive(chosenAdditive)
                            .build();
                }
            } catch (NumberFormatException _) {/* skip */}
            coffeeShop.takeOrder(clonedOrder);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}