package CollectionApi;
import java.util.*;

public class HashMapPractice {
    public static void main(String [] args){
        Map<Integer, Integer> map = new HashMap<>(Map.of(10,10, 20,1));
        Map<Integer, Integer> map2 = new HashMap<>();

        map2.put(1,2);
        map2.put(1,4);
        map2.put(3,5);

        System.out.println(map);
        System.out.println(map2);

        System.out.println(map.isEmpty());
        System.out.println(map.get(10));
        System.out.println(map2.containsKey(1));
        System.out.println(map2.containsValue(4));
        map2.putAll(Map.of(5,2,6,5));
        System.out.println(map2);

        System.out.println(map2.size());
        System.out.println(map2.remove(5));
        System.out.println(map2);

        Set<Integer> keySet = map2.keySet();
        System.out.println(keySet);

        Collection<Integer> valueSet = map2.values();
        System.out.println(valueSet);

        Set<Map.Entry<Integer, Integer>> entrySet = map2.entrySet();

        for(Map.Entry<Integer, Integer> entry: entrySet){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for(Map.Entry<Integer, Integer> entry: entrySet){
            System.out.println(entry);
        }

        System.out.println(map2.getOrDefault(10, 0));
        map2.forEach((a,b) -> {System.out.println(a + " -> " + b);});

    }
}
