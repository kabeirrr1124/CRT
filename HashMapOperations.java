import java.util.*;
public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        System.out.println("Keys: " + map.keySet());
        map.put("D", 40);
        System.out.println("After Adding: " + map);
        map.remove("B");
        System.out.println("After Removing B: " + map);
        System.out.println("Key C Exists: " + map.containsKey("C"));
        System.out.println("Iterating HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("E", 50);
        map2.put("F", 60);
        HashMap<String, Integer> mergedMap = new HashMap<>(map);
        mergedMap.putAll(map2);
        System.out.println("Merged HashMap: " + mergedMap);
        int[] arr = {1, 2, 1, 3, 2, 1, 4, 3};
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency Count: " + freqMap);
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : mergedMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("Key with Maximum Value: " + maxKey);
        HashMap<Integer, String> reverseMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mergedMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Reversed HashMap: " + reverseMap);
    }
}