// enum Laptop {
//     Macbook(1200), Thinkpad(1400), Lenovo(1500), XPS(5000), Asus;

//     private int price;

//     private Laptop(int price){
//         this.price = price;
//         System.out.println("in Laptop " + this.name());
//     }

//     private Laptop(){
//         this.price = 0;
//     }

//     public int getPrice(){
//         return price;
//     }

//     public void setPrice(int price){
//         this.price = price;
//     }
// }


class A {
    public void showthisthat(){
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    public void showthisthat(){
        System.out.println("in B show");
    }
}

@FunctionalInterface
interface C {
    void show();
}

class D implements C {
    public void show(){
        System.out.println("hi this is class D");
    }
}

public class Day12 {
    public static void main(String [] args){
        // Laptop s = Laptop.Macbook;
        // System.out.println(s.getPrice());
        // System.out.println(Laptop.values()[0]);

        // for(Laptop lap: Laptop.values()){
        //     System.out.println(lap + " : " + lap.getPrice());
        // }

        // B obj = new B();
        // obj.showthisthat();

        C obj = new D();
        obj.show();

        C obj2 = new C(){
            public void show(){
                System.out.println("This is in inner ano class");
            }
        };
        obj2.show();
    }
}
