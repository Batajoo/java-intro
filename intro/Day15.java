import java.util.*;
import java.io.*;

public class Day15 {
    public static void main(String [] args) throws InterruptedException ,NumberFormatException, IOException{

        // int i = 0;
        // int j = 0;

        // try{
        //     j = 18/ i;
        // }
        // catch(Exception e){
        //     System.out.println("Something went wrong.");
        // }
        // finally{
        //     System.out.println("Bye");
        // }

        // int num = 0;
        // BufferedReader br = null;
        // try {
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader(in);
        //     num = Integer.parseInt(br.readLine());
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("Bye");
        //     br.close();
        // }   

        //try with resources

        // int num = 0;
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }

        // A obj1 = new A();
        // B obj2 = new B();

        // System.out.println(obj1.getPriority());
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj1.start();
        // obj2.start();

        
        // System.out.println(obj1.getPriority());

        // A obj1 = new A();
        // Runnable obj2 = new Runnable() {
        //     public void run(){
        //         for(int i = 1; i <= 5; i++){
        //             System.out.println("Helloo");
        //             try{
        //             Thread.sleep(10);
        //             }
        //             catch(InterruptedException e){
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // };

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();

        // A obj1 = new A();
        // B obj2 = new B();
        // Runnable obj3 = new B();
        // Runnable obj4 = new Runnable(){
        //     public void run(){
        //         for(int i = 0; i < 5; i++){
        //             System.out.println("How are you?");
        //             try{
        //                 Thread.sleep(19);
        //             } catch(InterruptedException e){
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // };
        // Runnable obj5 = () -> {
        //     for(int i = 0; i < 5; i++){
        //         System.out.println("I am fine");
        //         try {
        //             Thread.sleep(10);
        //         } catch(InterruptedException e){
        //             e.printStackTrace();
        //         }
        //     }
        // };

        // Thread T3 = new Thread(obj3);
        // Thread tB = new Thread(obj2);
        // Thread T4 = new Thread(obj4);
        // Thread T5 = new Thread(new Runnable() {
        //     public void run(){
        //         System.out.println("This is in t5");
        //         try{
        //             Thread.sleep(10);
        //         } catch(InterruptedException e){
        //             e.printStackTrace();
        //         }
        //     }
        // });
        // Thread T6 = new Thread(obj5);

        // obj1.start();
        // tB.start();
        // T3.start();
        // T4.start();
        // T5.start();
        // T6.start();

        Counter c = new Counter();

        Runnable r1 = ()->{
            for(int i = 0; i<1000; i++)
                c.increment();
        };
        Runnable r2 = ()->{
            for(int i = 0; i<1000; i++)
                c.increment();
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.count);
    }

    
}

class A extends Thread {
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("HIii");
            try{
            Thread.sleep(10);
            }
            catch( InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Helloo");
            try{
            Thread.sleep(10);
            }
            catch( InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

final class Counter {
    int count = 0;
    final public synchronized void increment(){
        count++;
    }
}