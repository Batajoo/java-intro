// topics learned:
/*
 * interface 
 * class extends class
 * interface extends to interface
 * class implements to interface
 * class can impletemen multipe interface
 * interface can have properties but it become final and static
 * why is interface needed in programming and what program does it solve
 */

public class Day9 {
    public static void main(String [] args){
        // C obj = new C();
        // obj.show();
        // obj.config();
        // System.out.println(obj.b);
        // obj.run();

        // B obj = new C();
        // obj.config();
        // obj.show();

        // Y obj1 = new C();
        // obj1.run();
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Programmer david = new Programmer();
        david.doProgram(desk);
        david.doProgram(lap);
    }
}

interface Computer{
    void show();
}

class Laptop implements Computer {
    public void show(){
        System.out.println("Running in laptop");
    }
}

class Desktop implements Computer {
    public void show(){
        System.out.println("Running in desktop");
    }
}

class Programmer {
    void doProgram(Computer comp){
        comp.show();
    }
}

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

// abstract class A{
//     public abstract void show();
//     public abstract void config();
// }

// interface B {
//     int age = 44; // final and static 
//     String area = "Mumbai";
//     public abstract void show();
//     void config();
// }

// interface X{
//     void run();
// }

// interface Y extends X {

// }

// class C implements B,Y {
//     final int b = 10;
//     public void show(){
//         System.out.println("in show");
//     }

//     public void config(){
//         System.out.println("in config");
//     }

//     public void run(){
//         System.out.println("running...");
//     }
// }