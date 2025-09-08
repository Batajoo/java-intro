public class Day5 {
    public static void main(String [] arg){
        Human obj = new Human(10, "Sanjiv");
        // obj.setAge(20);
        // obj.setName("batajo");
        System.out.println(obj.getName() + " " + obj.getAge());

        
    }
}

class Human{
    private int age;
    private String name = "Sanjiv";
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }
    
    public Human() {
    }    
}
