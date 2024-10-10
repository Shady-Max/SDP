package Assignment3.Chain;

/**
 * Abstract class PaymentHandler defines the structure for the chain of responsibility.
 * Each payment handler should extend this class.
 */
public abstract class PaymentHandler {
    protected PaymentHandler next;

    /**
     * Sets the next handler in the chain.
     *
     * @param next The next handler to process the request if this one cannot.
     * @return The next handler, allowing chaining of method calls.
     */
    public PaymentHandler setNext(PaymentHandler next) {
        this.next = next;
        return next;
    }

    /**
     * Abstract method to handle the payment. Must be implemented by concrete handlers.
     * Handles the payment request if possible, otherwise passes it to the next handler in the chain.
     * @param money The amount of money required for payment.
     * @return true if payment is successful, false if not.
     */
    public abstract boolean handle(float money);
}
