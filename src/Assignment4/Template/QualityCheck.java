package Assignment4.Template;

/**
 * Abstract class representing the template method for quality checks.
 * It defines a skeleton process for checking products, delegating specifics to subclasses.
 */
public abstract class QualityCheck {

    /**
     * Template method defining the steps for checking a product.
     * This method is final to prevent subclasses from altering the workflow.
     */
    public final void checkProduct() {
        checkAppearance();
        checkSpecifics();
        generateReport();
    }

    /**
     * Checks the general appearance of the product.
     * This method is private, as it should not be altered by subclasses.
     */
    private void checkAppearance() {
        System.out.println("Checking product appearance...");
    }

    /**
     * Abstract method for product-specific checks.
     * Subclasses must implement this method to add custom checks.
     */
    protected abstract void checkSpecifics();

    /**
     * Generates a report after quality checks.
     * This method is private, ensuring the final report is always generated after checks.
     */
    private void generateReport() {
        System.out.println("Final report generated.\n");
    }

}
