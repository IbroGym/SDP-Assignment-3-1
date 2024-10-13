public class Main {
    public static void main(String[] args) {
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        paymentA.setNextHandler(paymentB);
        paymentB.setNextHandler(paymentC);

        double purchaseAmount = 210;
        paymentA.handlePayment(purchaseAmount);
    }
}
