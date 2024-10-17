package Assignment4.Template;

/**
 * Concrete implementation of QualityCheck for electronics products.
 * Provides specific checks for electronics such as functionality and warranty.
 */
public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecifics() {
        System.out.println("Checking electronics functionality...");
        System.out.println("Checking electronics warranty...");
    }
}
