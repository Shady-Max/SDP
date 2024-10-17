package Assignment3.Chain;

/**
 * PaymentB class represents another payment handler in the chain.
 * It handles payments up to 300 dollars.
 */
public class PaymentB extends PaymentHandler{
    private float dollars = 300;

    @Override
    public boolean handle(float money) {
        if (dollars >= money) {
            System.out.println("Payment B: You have enough money!");
            dollars -= money;
            return true;
        }
        System.out.println("Payment B: You don't have enough money!");
        if (next == null) return false;
        return next.handle(money);
    }

}
