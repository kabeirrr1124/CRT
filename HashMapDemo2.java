import java.util.*;
class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Chiranjivi", 700);
        hm.put("Bala", 100);
        hm.put("Shyam", 500);
        System.out.println(hm);
        System.out.println(hm.put("Chiranjivi", 1000));
        System.out.println(hm);
        Set<String> s = hm.keySet();
        System.out.println(s);
        Collection<Integer> c = hm.values();
        System.out.println(c);
        Set<Map.Entry<String, Integer>> s1 = hm.entrySet();
        System.out.println(s1);
        for (Map.Entry<String, Integer> m1 : s1) {
            System.out.println(m1.getKey() + " " + m1.getValue());
            if (m1.getKey().equals("Bala")) {
                m1.setValue(10000);
            }
            System.out.println(m1);
        }
        System.out.println("Updated HashMap:" + hm);
    }
}