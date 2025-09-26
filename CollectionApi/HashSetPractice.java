package CollectionApi;
import java.util.*;

public class HashSetPractice {
    public static void main(String [] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.remove(10));
        System.out.println(set.contains(20));
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        set.clear();
        System.out.println(set);
    }
}
