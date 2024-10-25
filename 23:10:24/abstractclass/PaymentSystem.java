package payment.java.abstractclass;

public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment = new CardPayment(100.00, "1234-5678-9012-3456");

        payment.processPayment();
    }
}

