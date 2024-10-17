package Assignment4.Strategy;

/**
 * Strategy interface defining the contract for different payment strategies.
 * Each strategy will provide its own implementation of calculating the final order amount.
 */
public interface PaymentStrategy {
    /**
     * Calculates the final amount for an order based on the payment method.
     *
     * @param orderAmount the original order amount.
     * @return the final order amount after applying the payment strategy.
     */
    double calculateFinalAmount(double orderAmount);
}
