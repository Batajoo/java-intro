import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.function.Function;
/*
 * Collection - List, Queue, Set
 * List - ArrayList, Linkedlist
 * Queue - Deque
 * Set - HashSet, LinkedHashSet
 */
public class Day16 {
    public static void main(String [] args){
        // Collection<Integer> nums = new TreeSet<Integer>();
        // nums.add(30);
        // nums.add(4);
        // nums.add(52);
        // nums.add(6);
        // nums.add(6);
        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(3));

        // Iterator<Integer> values = nums.iterator();
        // while(values.hasNext())
        //     System.out.println(values.next());

        //     for(int n: nums)
        //         System.out.println(n);

        // Map<String, Integer> student = new Hashtable<>();

        // student.put("Navin", 56);
        // student.put("Harsh", 23);
        // student.put("Sushil", 67);
        // student.put("Kiran", 92);
        // student.put("Harsh", 50);

        // System.out.println(student.get("Harsh"));

        // for(String key: student.keySet())
        //     System.out.println(student.get(key));   

        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer a, Integer b){

        //     }
        // };

        // Comparator<Integer> com1 = (Integer a, Integer b) -> {
        //     if(a%10 > b%10) return 1;
        //     return -1;
        // };

        // List<Integer> nums = new ArrayList<>();

        // nums.add(5);
        // nums.add(62);
        // nums.add(12);
        // nums.add(8);

        // Collections.sort(nums, com1);

        // System.out.println(nums);

        // List<Student> nums = new ArrayList<>();
        // nums.add(new Student(12, "Batman"));
        // nums.add(new Student(21, "man"));
        // nums.add(new Student(32, "atman"));
        // nums.add(new Student(4, "tman"));
        // nums.add(new Student(23, "Baman"));

        // Comparator<Student> comNums = new Comparator<Student>(){
        //     public int compare(Student s1, Student s2){
        //         if(s1.age > s2.age) return 1;
        //         return -1;
        //     }
        // }; 

        // for(Student s: nums)
        //     System.out.println(s);

        // System.out.println();

        // Collections.sort(nums);

        // for(Student s: nums)
        //     System.out.println(s);

        // List<Integer> nums = Arrays.asList(4,5,6,3,2);

        // for(int i = 0; i < nums.size(); i++){
        //     System.out.println(nums.get(i));
        // }

        // for(int n: nums){
        //     System.out.println(n);
        // }

        // System.out.println();


        // int sum = 0;
        // for(int n: nums){
        //     if(n%2 == 0){
        //         n = n * 2;
        //         sum = sum + n;
        //     }
        // }



        // System.out.println(sum);

        List<Integer> nums = Arrays.asList(4,5,6,3,2);


        Consumer<Integer> con = new Consumer<Integer>(){
            public void accept(Integer n){
                System.out.println(n);
            }
        };

        Consumer<Integer> con2 = (n) -> System.out.println(n);
        
        nums.forEach(n-> System.out.println(n));
        System.out.println();
        nums.forEach(con2);

        System.out.println();

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n-> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n->n * 2);
        // int result = s3.reduce(0, (c, e)-> c+e);

        Predicate<Integer> p = new Predicate<Integer>(){
            public boolean test(Integer t){
                if(t % 2 == 0) return true;
                return false;
            }
        };

        Function<Integer, Integer> fun = new Function<Integer, Integer>(){
            public Integer apply(Integer n){
                return n*2;
            }
        };

        // int result = nums.stream()
        //                 .filter(p)
        //                 .map(fun)
        //                 .reduce(0, (c, e)-> c+e);
        // System.out.println(result);

        Stream<Integer> sortedValues = nums.stream()
                                        .filter(n->n%2==0)
                                        .sorted();
        sortedValues.forEach(n->System.out.println(n));

        //parallel threads
        
    }
}

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student another){
        if(this.age > another.age) return 1;
        return -1;
    }
}
