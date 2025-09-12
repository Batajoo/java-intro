//types of interfaces: normal, functional/ SAM, Marker
// serialization: store data in hard drive of a obj, example would be saving save point in a game , deserialization 
// Exceptions:
/*
 * Compile-time error
 * Run-time error -> Exceptions Handling
 * Logical error
 */

@FunctionalInterface
interface A {
    void show();
}

class B implements A {
    public void show(){
        System.out.println("in show");
    }
}

@FunctionalInterface
interface C{
    void run(int i);
}

@FunctionalInterface
interface Add{
    int add(int i, int j);
}

public class Day13 {
    public static void main(String [] args){
        // A obj = new B();
        // obj.show();

        // A obj2 = new A() {
        //     public void show(){
        //         System.out.println("in show 2");
        //     }
        // };
        // obj2.show();
        
        // A obj3 = () -> {
        //     System.out.println("Inside the lamda expression");
        // };

        // C obj4 = i -> System.out.println("One line lamda expression : " + i);
        

        // obj4.run(5);
        // obj3.show();

        // Add obj = (i, j) -> i+j;

        // System.out.println(obj.add(10,10));

        int nums[] = new int[5];
        String str = null;

        int i = 1;
        int j = 0;

        try {
            j = 8 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } 
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit. " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong.." + e);
        }

        System.out.println(j);

    }
}
