// import java.util.*;



public class Day2{
    public static void main(String [] args){
        // Calculator cal = new Calculator();
        // int result = cal.add(2,5);
        // System.out.println(result);

        // Computer obj = new Computer();
        // obj.playMusic();
        // String str = obj.getMePen(10);
        // System.out.print(str);
        int data = 10;
        Calculator obj = new Calculator();
        Calculator obj2 = new Calculator();
        int r1 = obj.add(2, 3, 1);
        // System.out.println(r1);
        System.out.println(obj2);
        System.out.println(obj);
    }
}


class Calculator{
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public double add(double n1, double n2){
        return n1 + n2;
    }
}

class Computer {
    public void playMusic(){
        System.out.println("Music playing");
    }

    public String getMePen(int cost){
        if(cost >= 10)
            return "Pen";
        else 
            return "Nothing";
    }
}



// public class Day2 {
//     public static void main(String [] args){
//         // int x = 27;
//         // int y = 23;
//         // int z = 6;
//         // int y = 5;
//         // int a = 5;
//         // int b = 9;

//         // boolean result = x > y || a < b;

//         // if(result)
//         //     System.out.println("This is true");
//         // else
//         //     System.out.println("This is false"); 

//         // Scanner in = new Scanner(System.in);
//         // x = in.nextInt();
//         // y = in.nextInt();
//         // z = in.nextInt();

//         // if(x > y && x > z)
//         //     System.out.println(x);
//         // else if(y > x && y > z)
//         //     System.out.println(y);
//         // else 
//         //     System.out.println(z);

//         // int result = 0;
//         // result = x % 2 == 0 ? 10 : 20;
//         // System.out.println(result);

//         // int n;
//         // Scanner in = new Scanner(System.in);

//         // n = in.nextInt();

//         // switch(n){
//         //     case 1:{
//         //         System.out.println("hi");
//         //         System.out.println("Monday");
//         //     }
//         //         break;
//         //     case 2: 
//         //         System.out.println("Tuesday");
//         //         break;
//         //     case 3:
//         //         System.out.println("Wednesday");
//         //         break;
//         //     case 4:
//         //         System.out.println("Thursday");
//         //         break;
//         //     case 5:
//         //         System.out.println("Friday");
//         //         break;
//         //     case 6:
//         //         System.out.println("Saturday");
//         //         break;
//         //     case 7:
//         //         System.out.println("Sunday");
//         //         break;
//         //     default:
//         //         System.out.println("Invalid day");
//         // }

//         // for(int i = 0; i< 10; i++){
//         //     System.out.print(i);
//         // }

//         // int i = 0;
//         // do {
//         //     System.out.println("hi " + i);

//         //     i++;
//         // }while(i <= 1);
        
//         // for(int i = 1; i <=5 ; i++){
//         //     System.out.println("DAY " + i);

//         //     for(int j = 1; j <= 9; j++){
//         //         System.out.println("    " + (j+8) + " - " + (j+9));
//         //     }
//         // }

         
//     }
// }

// Object Oriented Programming
// Object - Properties and Behaviours

// Class 