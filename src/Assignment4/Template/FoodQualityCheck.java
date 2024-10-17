package Assignment4.Template;

/**
 * Concrete implementation of QualityCheck for food products.
 * Provides specific checks for food such as expiration date and composition.
 */
public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecifics() {
        System.out.println("Checking food expiration date...");
        System.out.println("Checking food composition...");
    }
}
