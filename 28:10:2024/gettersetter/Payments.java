package Assignments.gettersetter;

public class Payments {
    // Fields
    private Long paymentId;
    private Double amount;

    // Constructor
    public Payments(Long paymentId, Double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    // Getter for paymentId
    public Long getPaymentId() {
        return paymentId;
    }

    // Setter for paymentId
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    // Getter for amount
    public Double getAmount() {
        return amount;
    }

    // Setter for amount
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        // Create a payment
        Payments payment = new Payments(1L, 150.00);

        // Display payment details
        System.out.println("Payment ID: " + payment.getPaymentId());
        System.out.println("Amount: " + payment.getAmount());

        // Update and display the amount
        payment.setAmount(200.00);
        System.out.println("Updated Amount: " + payment.getAmount());
    }
}

