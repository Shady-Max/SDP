package Assignment4.Strategy;

/**
 * Concrete implementation of PaymentStrategy for wallet payments.
 * No additional fees or commission are added to the order amount.
 */
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount;
    }
}
