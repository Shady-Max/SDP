package CoffeeTypes;

/**
 * Represents a Cappuccino coffee type.
 * This class implements the Coffee interface and provides the string representation for Cappuccino.
 */
public class Cappuccino implements Coffee{
    @Override
    public String prepare() {
        return "Cappuccino";
    }
}
