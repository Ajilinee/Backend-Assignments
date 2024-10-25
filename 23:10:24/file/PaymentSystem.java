package payment.java.file;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PaymentSystem {

    private static final String FILENAME = "payments.txt";

    public static void writePayments(double amount) {
        try (FileWriter writer = new FileWriter(FILENAME, true)) {
            writer.write("Payment: $" + amount + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void readPayments() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
    }

    public static void main(String[] args) {
        writePayments(100.00);

        readPayments();
    }
}
