package telusko.learnings;

import java.util.Scanner;

class SingleRunMethod implements Runnable{

    @Override
    public void run() {

        if(Thread.currentThread().getName().equals("Thread1")){
            example1();
        }else  if(Thread.currentThread().getName().equals("Thread2")){
            example2();
        }else{
            example3();
        }
    }

    public void example1() {
        System.out.println("Thread activity 1 started");
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
        System.out.println("Thread activity 1 ended");
    }

    public void example2() {
        System.out.println("Thread activity 2 started");
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println((char)i);
        }
        System.out.println("Thread activity 2 ended");
    }

    public void example3() {
        System.out.println("Thread activity 3 started");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name :");
        String name = sc.nextLine();
        System.out.println("Thread activity 3 ended");

    }
}



public class TestMultiThreadingRunExample {

    public static void main(String[] args) {


        SingleRunMethod single = new SingleRunMethod();

        Thread t1 = new Thread(single);
        Thread t2 = new Thread(single);
        Thread t3 = new Thread(single);

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t3.start();


    }
}


