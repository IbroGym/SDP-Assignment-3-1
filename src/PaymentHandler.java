abstract class PaymentHandler {
    protected PaymentHandler nextHandler;
    protected double balance;

    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handlePayment(double amount) {
        if (balance >= amount) {
            System.out.println(getClass().getSimpleName() + " handled payment of $" + amount);
        } else if (nextHandler != null) {
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("Payment could not be handled. Insufficient funds.");
        }
    }
}
