package payment.java.inheritance;

public class EmailPayment extends Payment {
    private String email;

    public EmailPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void process() {
        System.out.println("Processing PayPal payment of $" + amount + " from email: " + email);
    }
}

