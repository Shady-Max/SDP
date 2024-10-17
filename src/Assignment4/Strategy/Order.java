package Assignment4.Strategy;

/**
 * The context class representing an order.
 * It holds the order amount and allows applying different payment strategies.
 */
public class Order {

    private PaymentStrategy paymentStrategy;
    private double orderAmount;

    public Order(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * Sets the payment strategy to be used for calculating the final amount.
     *
     * @param paymentStrategy the payment strategy to be applied.
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Calculates the final amount of the order by applying the selected payment strategy.
     *
     * @return the final amount after applying the strategy.
     */
    public double calculateFinalAmount() {
        return paymentStrategy.calculateFinalAmount(orderAmount);
    }

}
