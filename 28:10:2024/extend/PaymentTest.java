package Assignments.extend;

class Payment {
 private Long paymentId;
 private Double amount;

 public Payment(Long paymentId, Double amount) {
     this.paymentId = paymentId;
     this.amount = amount;
 }

 public Long getPaymentId() {
     return paymentId;
 }

 public Double getAmount() {
     return amount;
 }

 public void displayPaymentDetails() {
     System.out.println("Payment ID: " + paymentId);
     System.out.println("Amount: " + amount);
 }
}

class CreditCardPayment extends Payment {
 private String cardNumber;

 public CreditCardPayment(Long paymentId, Double amount, String cardNumber) {
     super(paymentId, amount); 
     this.cardNumber = cardNumber;
 }

 public String getCardNumber() {
     return cardNumber;
 }

 @Override
 public void displayPaymentDetails() {
     super.displayPaymentDetails(); 
     System.out.println("Card Number: " + cardNumber);
 }
}

public class PaymentTest {
 public static void main(String[] args) {
     CreditCardPayment ccPayment = new CreditCardPayment(1L, 150.00, "1234-5678-9876-5432");

     ccPayment.displayPaymentDetails();
 }
}

