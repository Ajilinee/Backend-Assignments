package payment.java.thread;

public class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public void process() {
        System.out.println("Processing payment for transaction: " + transactionId);
        try {
            Thread.sleep(1000); 
            System.out.println("Payment of $" + amount + " processed for transaction: " + transactionId);
        } catch (InterruptedException e) {
            System.out.println("Payment processing interrupted for transaction: " + transactionId);
        }
    }
}
