public class Payment implements PaymentMethod {

    private String paymentId;

    // Constructor
    public Payment(String paymentId) {
        this.paymentId = paymentId;
    }

    // Getter
    public String getPaymentId() {
        return paymentId;
    }

    // Implement interface method
    @Override
    public void pay(double amount) {

        System.out.println(
            "Payment success: $" + amount
        );

        System.out.println(
            "Payment ID: " + paymentId
        );
    }
}