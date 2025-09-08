public class Day9 {
    public static void main(String [] args){
        // C obj = new C();
        // obj.show();
        // obj.config();
        // System.out.println(obj.b);
        // obj.run();

        B obj = new C();
        obj.config();
        obj.show();

        Y obj1 = new C();
        obj1.run();

    }
}

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

// abstract class A{
//     public abstract void show();
//     public abstract void config();
// }

interface B {
    int age = 44; // final and static 
    String area = "Mumbai";
    public abstract void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X {

}

class C implements B,Y {
    final int b = 10;
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }

    public void run(){
        System.out.println("running...");
    }
}