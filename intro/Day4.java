public class Day4 {
    public static void main(String [] args){
        // Mobile obj1 = new Mobile();
        // obj1.show();
        // Class.forName("Mobile");
        Mobile obj1 = new Mobile();
        obj1.show();
        Mobile.show1(obj1);
    }
}

class Mobile {
    String brand;
    int price;
    static String name;

    // static {
    //     name = "Phone";
    //     System.out.println("in static block");
    // }

    // public Mobile(){
    //     brand = "";
    //     price = 200;
    //     name = "Phone";
    //     System.out.println("in constructor");
    // }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + "in static method");
    }
}
