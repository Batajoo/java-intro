import java.util.*;

public class Day17 {
    public static void main(String [] args){
        Collection<Integer> c1 = new ArrayList<>();
        Collection<Integer> c2 = c1;
        c1.add(10);
        System.out.println(c1.size());
        System.out.println(c1.equals(c2));
        System.out.println(c1.isEmpty());
    }
}
