package payment.java.inheritance;

public class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void process() {
        System.out.println("Processing payment of $" + amount);
    }
}

