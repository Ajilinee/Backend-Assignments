package payment.java.inheritance;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CardPayment(100.00, "1234-5678-9101-1121");
        Payment payPalPayment = new EmailPayment(200.50, "user@example.com");

        processPayment(creditCardPayment);
        processPayment(payPalPayment);
    }

    public static void processPayment(Payment payment) {
        payment.process(); 
    }
}

