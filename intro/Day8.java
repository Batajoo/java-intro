

public class Day8 {
    public static void main(String [] args){
        // polymorphism
        // compile time and run time
        // overloading      overriding 

        // A  obj = new A();
        // obj.show();

        // obj = new B();
        // obj.show();

        // obj = new C();
        // obj.show();

        // final int num = 8;
        // System.out.println(num);

        // AdvCalc obj = new AdvCalc();
        // obj.show();
        // obj.add(4, 5); 

        // Laptop obj1 = new Laptop();
        // obj1.model = "Lenovo";
        // obj1.price = 1000;

        // System.out.println(obj1);

        // Laptop obj2 = new Laptop();
        // obj2.model = "Lenovo";
        // obj2.price = 10011;

        // System.out.println(obj2);
        
        // boolean result = obj1.equals(obj2);
        // System.out.println(result);

        // double d = 4.5;
        // int i = (int) d;

        // System.out.println(i);

        // A obj = new B();
        // obj.show1();

        // B obj1 = (B) obj;
        // obj1.show2();

        // Car obj = new wagonR();
        // obj.drive();
        // obj.playMusic();
        // obj.fly();

        // abstract class and concrete class
    
        // A obj = new A();
        // obj.show();

        // A.B obj1 = obj.new B();
        // A.C obj2 = new A.C();
        // obj2.show2();

        // B obj = new B();
        // obj.show();

        // A obj2 = new A(){
        //     public void show(){
        //         System.out.println("in new");
        //     }
        // };

        // obj2.show();


        // anonymous abstract inner class
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };
        // obj.show();
    }
}

abstract class A {
    public abstract void show();
}

class B extends A {
    public void show(){
        System.out.println("in show");
    }
}

// class A {
//     public void show(){
//         System.out.println("in A show");
//     }
// }

// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

// class A {
//     int age;
//     public void show(){
//         System.out.println("in show");
//     }

//     class B{
//         public void config(){
//             System.out.println("in config");
//         }
//     }

//     static class C{
//         public void show2(){
//             System.out.println("in show2");
//         }
//     }
// }

// abstract class Car{
//     public abstract void drive();
//     public abstract void fly();

//     public void playMusic(){
//         System.out.println("Play music");
//     }
// }

// abstract class wagonR extends Car {
//     public void drive(){
//         System.out.println("Driving...");
//     }

//     public void show(){
//         System.out.println("show");
//     }
// }

// class UpdatedWagonr extends wagonR {
//     public void fly(){
//         System.out.println("flying...");
//     }
// }

// class A {
//     public void show1(){
//         System.out.println("in A show");
//     }
// }

// class B extends A {
//     public void show2(){
//         System.out.println("in B show");
//     }
// }

// class Laptop extends Object {
//     String model;
//     int price;

   

//     @Override
//     public String toString() {
//         return "Laptop [model=" + model + ", price=" + price + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + ((model == null) ? 0 : model.hashCode());
//         result = prime * result + price;
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Laptop other = (Laptop) obj;
//         if (model == null) {
//             if (other.model != null)
//                 return false;
//         } else if (!model.equals(other.model))
//             return false;
//         if (price != other.price)
//             return false;
//         return true;
//     }
// }

// final class Calc{
//     public final void show(){
//         System.out.println("in Calc show");
//     }

//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }

// class AdvCalc extends Calc {
//     public void show(){
//         System.out.println("By John");
//     }
// }

// class A {
//     public void show(){
//         System.out.println("in A show");
//     }
// }

// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

// class C extends A{
//     public void show(){
//         System.out.println("in C show");
//     }
// }

// class D {

// }
