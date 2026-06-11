import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(101, "Kabeir");
        map.put(102, "Dhruv");
        map.put(103, "Aryan");
        map.put(104, "Advait");

        System.out.println("Key Value Pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                               ", Value: " + entry.getValue());
        }
    }
}