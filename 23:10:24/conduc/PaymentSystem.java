package payment.java.conduc;

public class PaymentSystem {
    public static void main(String[] args) {
        Payment payment1 = new Payment(100.00);
        payment1.processPayment();

        Payment payment2 = new Payment(200.00);
        payment2.processPayment();

        payment1 = null;
        payment2 = null;

        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

