package Assignment4.Strategy;

/**
 * Concrete implementation of PaymentStrategy for card payments.
 * A 2% commission is added to the order amount when paying with a card.
 */
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        double commission = orderAmount * 0.02;
        return orderAmount + commission;
    }
}
