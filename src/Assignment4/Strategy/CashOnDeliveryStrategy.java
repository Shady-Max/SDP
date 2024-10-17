package Assignment4.Strategy;

/**
 * Concrete implementation of PaymentStrategy for Cash on Delivery payments.
 * A fixed fee of 300 units is added to the order amount for delivery.
 */
public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount + 300;
    }
}
