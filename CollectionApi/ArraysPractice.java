package CollectionApi;
import java.util.*;

public class ArraysPractice {
    public static void main(String [] args){
        // int [] a = new int[]{1,3,4,6,0,-1};
        // Arrays.sort(a);

        // String arr[] = new String[]{"b", "a", "cd"};
        // Arrays.sort(arr);

        // System.out.println(Arrays.binarySearch(a, 3));
        // System.out.println(Arrays.binarySearch(a, 5));
        // System.out.println(Arrays.binarySearch(a, 3, 5, 3));
        // System.out.println(Arrays.binarySearch(a, 0, 3, 1));
        // System.out.println(Arrays.asList(arr));

        // Students [] stuArr = new Students[]{new Students(12, "Batman"), 
        //                                     new Students(1, "Spiderman"),
        //                                     new Students(5, "Ironman")};
        // Comparator<Students> stuCompRev = (a,b) -> {
        //     if(a.rollNumber < b.rollNumber) return 1;
        //     return -1;
        // };

        // Comparator<Students> stuComp2 = new Comparator<Students>(){
        //     public int compare(Students a,Students b){
        //         if(a.rollNumber < b.rollNumber) return -1;
        //         return 1;
        //     }
        // };

        // Comparator<Students> stuEquals = (a, b)->{
        //     if(a.equals(b)) return 0;
        //     return 1;
        // };
        // Arrays.sort(stuArr,stuComp2);
        // System.out.println(Arrays.asList(stuArr));
        // System.out.println(Arrays.binarySearch(stuArr, 1, 2, new Students(1, "Spiderman"), stuEquals));

        // int [] arr1 = new int[]{1,2,3,4,4};
        // int [] arr2 = Arrays.copyOf(arr1, 7);
        // int [] arr3 = Arrays.copyOfRange(arr2, 1, 3);
        // Integer [] arr4 = new Integer[]{2,3};

        // for(int a: arr2)
        //     System.out.print(a + " ");
        // System.out.println();
        // for(int a: arr3)
        //     System.out.print(a + " ");

        // Integer[] arr5 = List.of(2,3).toArray(new Integer[0]);
        // System.out.println(Arrays.deepEquals(arr4, arr5));

        // System.out.println(Arrays.deepToString(arr4));
        // System.out.println(Arrays.deepHashCode(arr5));
        // System.out.println(arr4);

        // int [] arr = new int[]{1,2,3};
        // int [] arr2 = new int[]{1,2,3};
        // int [][] arr3 = new int[][]{{1,2}, {2,3}};
        // int [][] arr4 = new int[][]{{1,2}, {2,3}};

        // System.out.println(Arrays.equals(arr, arr2));
        // System.out.println(Arrays.deepEquals(arr3, arr4));

        // int [] arr = new int[5];
        // Arrays.fill(arr, 10);
        // Arrays.fill(arr, 1,4, 5);
        // System.out.println(Arrays.toString(arr));

        // int [] arr = {1,2,3,4};
        // int [] arr2 = {1,2,3,4};
        // System.out.println(arr.hashCode());
        // System.out.println(arr2.hashCode());
        // System.out.println(Arrays.hashCode(arr));
        // System.out.println(Arrays.hashCode(arr2));

        Students [] stuArr = {
                                new Students(12, "Batman"), 
                                new Students(1, "Spiderman"),
                                new Students(5, "Ironman")
                            };
        Arrays.sort(stuArr);
        System.out.println(Arrays.deepToString(stuArr));
        System.out.println(Arrays.asList(1,2,4));
    }
}


class Students implements Comparable<Students>{
    int rollNumber;
    String name;

    public Students(int roll, String name){
        rollNumber = roll;
        this.name = name;
    }

    // public String toString(){
    //     return rollNumber + " " + name;
    // }

    public boolean equals(Students that){
        return this.name == that.name && this.rollNumber == that.rollNumber;
    }

    public int compareTo(Students that){
        if(this.rollNumber == that.rollNumber) return 0;
        if(this.rollNumber < that.rollNumber) return -1;
        return 1;
    }
}
