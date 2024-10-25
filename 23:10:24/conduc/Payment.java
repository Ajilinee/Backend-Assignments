package payment.java.conduc;

public class Payment {
    private double amount;
    
    public Payment(double amount) {
        this.amount = amount;
        System.out.println("Payment of $" + amount + " created.");
    }

    public void processPayment() {
        System.out.println("Processing payment of $" + amount);
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Payment of $" + amount + " is being destroyed.");
        } finally {
            super.finalize();
        }
    }
}

