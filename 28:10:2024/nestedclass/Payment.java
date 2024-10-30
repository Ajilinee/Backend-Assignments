package Assignments.nestedclass;

public class Payment {
    private long paymentId;
    private double amount;

    public Payment(long paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public void displayPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: $" + amount);
    }

    public class Transaction {
        private String transactionId;
        private String date;

        public Transaction(String transactionId, String date) {
            this.transactionId = transactionId;
            this.date = date;
        }

        public void displayTransaction() {
            System.out.println("Transaction ID: " + transactionId);
            System.out.println("Date: " + date);
        }
    }

    public static void main(String[] args) {
        Payment payment = new Payment(101, 250.75);
        payment.displayPayment();

        Payment.Transaction transaction = payment.new Transaction("STA12345", "2024-10-29");
        transaction.displayTransaction();
    }
}

