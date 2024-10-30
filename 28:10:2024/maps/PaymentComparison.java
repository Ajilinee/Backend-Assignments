package Assignments.maps;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class PaymentComparison {

    public static void main(String[] args) {
        Map<Long, String> hashMap = new HashMap<>();
        hashMap.put(1L, "Payment 1 - HashMap");
        hashMap.put(2L, "Payment 2 - HashMap");
        hashMap.put(3L, "Payment 3 - HashMap");
        System.out.println("HashMap: " + hashMap);

        Map<Long, String> hashTable = new Hashtable<>();
        hashTable.put(1L, "Payment 1 - Hashtable");
        hashTable.put(2L, "Payment 2 - Hashtable");
        System.out.println("Hashtable: " + hashTable);

        Map<Long, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1L, "Payment 1 - LinkedHashMap");
        linkedHashMap.put(2L, "Payment 2 - LinkedHashMap");
        linkedHashMap.put(3L, "Payment 3 - LinkedHashMap");
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}

