package Assignments.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentManager {
    private Map<Long, List<Double>> paymentMap;

    public PaymentManager() {
        paymentMap = new HashMap<>();
    }
    public void addPayment(Long key, Double payment) {
        paymentMap.putIfAbsent(key, new ArrayList<>());
        paymentMap.get(key).add(payment);
    }

    public void displayPayments(Long key) {
        List<Double> payments = paymentMap.get(key);
        if (payments != null && !payments.isEmpty()) {
            System.out.println("Payments for key " + key + ": " + payments);
        } else {
            System.out.println("No payments found for key " + key);
        }
    }

    public static void main(String[] args) {
        PaymentManager manager = new PaymentManager();
        
        manager.addPayment(101L, 100.50);
    
        manager.displayPayments(101L); 
    }
}

