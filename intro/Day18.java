import java.util.*;

public class Day18 {
    public static void main(String [] args){
        // Collection<Integer> col1 = new ArrayList<>();
        // col1.add(10);
        // col1.add(20);
        // col1.add(10);

        // // List<Integer> col2 = new ArrayList<>();
        // // Collection<Integer> col3 = col2;

        // // ArrayList<Integer> col4 = new ArrayList<>();

        // Collection<Integer> col2 = new ArrayList<>();
        // col2.addAll(col1);
        // // col2.removeAll(List.of(10));
        

        // // System.out.println(col1.iterator().next());
        // // System.out.println(col1);
        // col1.forEach(e->System.out.println(e));
        // System.out.println(col2);

        // List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3));
        // l1.addAll(1,List.of(1,2,3));
        // System.out.println(l1);

        List<Integer> l1 = new ArrayList<>(Arrays.asList(32,43,65));
        Integer [] c = l1.toArray(new Integer[0]);

        System.out.println(c);
        System.out.println(l1);

    }
}
