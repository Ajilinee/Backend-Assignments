package payment.java.abstractclass;


public class CardPayment extends Payment {
    public CardPayment(double amount) {
		super(amount);
	}

	private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " with card number: " + cardNumber);
    }
}
