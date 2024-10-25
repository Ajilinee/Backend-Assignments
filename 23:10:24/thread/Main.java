package payment.java.thread;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new Payment("TXN001", 100.00);
        Payment payment2 = new Payment("TXN002", 150.50);
        Payment payment3 = new Payment("TXN003", 200.75);

        new Thread(() -> payment1.process()).start();
        new Thread(() -> payment2.process()).start();
        new Thread(() -> payment3.process()).start();
    }
}

