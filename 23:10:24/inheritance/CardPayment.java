package payment.java.inheritance;

public class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void process() {
        System.out.println("Processing credit card payment of $" + amount + " with card number: " + cardNumber);
    }
}

