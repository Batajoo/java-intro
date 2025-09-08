public class Day3 {
    public static void main(String [] args){
        // int [] num = new int[4];
        // num[0] = 4;
        // num[1] = 8;
        // num[2] = 3;
        // num[3] = 9;
        // for(int i = 0; i <= 3; i++)
        //     System.out.println(num[i]);

        // int [][] num = new int[3][4];

        // for(int i = 0; i<num.length; i++){
        //     for(int j = 0; j < num[1].length; j++){
        //         num[i][j] = (int) (Math.random() * 10);
        //     }
        // }

        // for(int i = 0; i< num.length; i++){
        //     for(int j = 0; j < num[0].length; j++){
        //         System.out.print(num[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }

        // System.out.println();

        // for(int [] n: num){
        //     for(int n1: n){
        //         System.out.print(n1 + " ");
        //     }
        //     System.out.println();
        // }

        // int [][] num2 = new int[3][];
        // num2[0] = new int [3];
        // num2[1] = new int [4];
        // num2[2] = new int[2];

        // for(int  i = 0; i<num2.length; i++){
        //     for(int j = 0; j < num2[i].length; j++){
        //         num2[i][j] = (int) (Math.random() * 10);
        //     }
        // }

        // for(int[] a1: num2){
        //     for(int n: a1){
        //         System.out.print(n + " ");
        //     }
        //     System.out.println();
        // }

        // int nums[] = {4,3,2,5};

        // for(int n : nums)
        //     System.out.println(n);

        // Student s1 = new Student();
        // s1.rollNo = 1;
        // s1.name = "Batman";
        // s1.marks = 93;

        // Student s2 = new Student();
        // s2.rollNo = 2;
        // s2.name = "Superman";
        // s2.marks = 82;

        // Student s3 = new Student();
        // s3.rollNo = 3;
        // s3.name = "Spiderman";
        // s3.marks = 91;

        // Student [] students = new Student[3];
        // Student [] classStudent = {s1, s2, s3};

        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for(int i =0; i<students.length; i++){
        //     System.out.println(classStudent[i].name);
        // }

        // for(Student stu: students){
        //     System.out.println(stu.name + " : " + stu.marks);
        // }

        // String name = "navin";
        // name = name + " reddy";
        // System.out.println("Hello " + name);
        // System.out.println(name.charAt(1));
    
        // StringBuffer sb = new StringBuffer("navin");
        // sb.append(" reddy");
        // sb.deleteCharAt(2);
        // sb.setLength(20);
        // sb.ensureCapacity(100);
        // System.out.println(sb);
        
        // String str = sb.toString();
        // System.out.println(str);

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1400;
        Mobile.name = "smart phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1900;
        Mobile.name = "Another smaart phone"; 

        obj1.show();
        obj2.show();
        
    }
}


// class Student {
//     int rollNo;
//     String name;
//     int marks;
// };

class Mobile {
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
};