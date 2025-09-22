package CollectionApi;
import java.util.*;

public class ArrayListPractice {
    public static void main(String [] args){
        // ArrayList<Integer> a1 = new ArrayList<>(List.of(12,3,4,2));
        // ArrayList<Integer> a2 = new ArrayList<>();
        // ArrayList<Integer> a3 = new ArrayList<>(10);

        // a1.sort((a,b)->a>b?1:-1);
        // Iterator<Integer> it = a1.iterator();
        // System.out.println(it.next());
        // System.out.println(a1);
        // System.out.println(a2);
        // System.out.println(a3);

        int [] a1 = new int[]{10,2,34,2,3};
        int [] a2 = a1;
        Arrays.sort(a1);
        int res = Arrays.binarySearch(a1, 3);
        System.out.println(res);
        System.out.println(a1.equals(a2));
    }
}
