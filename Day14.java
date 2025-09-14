import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class SanjivException extends RuntimeException{
    public SanjivException(String s){
        super(s);
    }
}

public class Day14 {
    public static void main(String [] args){

        // int i = 20;
        // int j = 0;

        // try {
        //     j = 18/i;
        //     if(j == 0)
        //         // throw new ArithmeticException("I don't want to print zero");
        //         throw new SanjivException("This is sanjiv exception");
        // }
        // catch(SanjivException e){
        //     j = 18/1;
        //     System.out.println("Thats the default output" + e);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }

        // System.out.println(j);
        // System.out.println("Bye");
        // try{
        // show2();
        // } catch(ArithmeticException e){
        //     System.out.println(e);
        // }

        // System.out.println("Enter a number");
        // int nums = 0;
        // try {
        //     nums = System.in.read();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }

        // System.out.println(nums);

        // System.out.println("Enter a number");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int nums = Integer.parseInt(bf.readLine());

        // System.out.println(nums);
        // bf.close();

        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        System.out.println(nums);


    }

    // public static void show() throws ArithmeticException {
    //     int i = 10/0;
    // }

    // public static void show2() throws ArithmeticException{
    //     System.out.println("inside show 2");
    //     show();
    // }
}
