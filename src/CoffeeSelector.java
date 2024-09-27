import java.util.Scanner;

/**
 * CoffeeSelector class provides a method for selecting a coffee type from user input.
 * It guides the user to choose between different types of coffee.
 */
public class CoffeeSelector {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the user to select a type of coffee.
     *
     * @return The name of the selected coffee type.
     */
    public static String chooseCoffee () {
        while (true) {
            System.out.println("Choose coffee: (1) Espresso, (2) Cappuccino");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        return "Espresso";
                    case 2:
                        return "Cappuccino";
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice");
            }
        }
    }
}
