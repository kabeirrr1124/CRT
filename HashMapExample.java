import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Kabeir");
        map.put(103, "Dhruv");
        map.put(102, "Aryan");
        map.put(104, "Advait");

        System.out.println("Key Value Pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                               ", Value: " + entry.getValue());
        }
    }
}