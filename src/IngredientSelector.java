import CoffeeIngredients.Additive;
import CoffeeIngredients.Ingredients.*;
import CoffeeIngredients.Milk;
import CoffeeIngredients.Syrup;

import java.util.Scanner;

/**
 * IngredientSelector class provides methods for selecting ingredients from user input.
 * It allows users to customize the ingredients (milk, syrup, additive) for their coffee order.
 */
public class IngredientSelector {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the user to select a type of milk for their coffee order.
     *
     * @param currentMilk The default milk type used in the selected coffee.
     * @return The selected milk type, or the default milk type if no valid input is provided.
     */
    public static Milk chooseMilk(Milk currentMilk) {
        System.out.println("Current milk: " + currentMilk.addMilk() + "\nChoose Milk: (1) No Milk, (2) Whole Milk, (3) Soy Milk or nothing to continue");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return switch (choice) {
                case 1 -> new NoMilk();
                case 2 -> new WholeMilk();
                case 3 -> new SoyMilk();
                default -> currentMilk;
            };
        } catch (NumberFormatException _) {
            return currentMilk;
        }
    }

    /**
     * Prompts the user to select a type of syrup for their coffee order.
     *
     * @param currentSyrup The default syrup used in the selected coffee.
     * @return The selected syrup type, or the default syrup if no valid input is provided.
     */
    public static Syrup chooseSyrup(Syrup currentSyrup) {
        System.out.println("Current syrup: " + currentSyrup.addSyrup() + "\nChoose Syrup: (1) No Syrup, (2) Vanilla Syrup, (3) Caramel Syrup or nothing to continue");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return switch (choice) {
                case 1 -> new NoSyrup();
                case 2 -> new VanillaSyrup();
                case 3 -> new CaramelSyrup();
                default -> currentSyrup;
            };
        } catch (NumberFormatException _) {
            return currentSyrup;
        }
    }

    /**
     * Prompts the user to select an additive for their coffee order.
     *
     * @param currentAdditive The default additive used in the selected coffee.
     * @return The selected additive, or the default additive if no valid input is provided.
     */
    public static Additive chooseAdditive(Additive currentAdditive) {
        System.out.println("Current Additive: "+ currentAdditive.addAdditive() + "\nChoose Additive: (1) No Additive, (2) Sugar, (3) Cinnamon or nothing to continue");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return switch (choice) {
                case 1 -> new NoAdditive();
                case 2 -> new Sugar();
                case 3 -> new Cinnamon();
                default -> currentAdditive;
            };
        } catch (NumberFormatException _) {
            return currentAdditive;
        }
    }
}
