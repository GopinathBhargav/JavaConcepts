package telusko.learnings;

import java.util.Scanner;


public class TestMultiThreadingAnonymousInnerClass {

    public static void main(String[] args) {

        System.out.println("activity in main thread started");
        System.out.println("opened resources in main thread");
        Thread t1 = new Thread(){
            @Override
            public void run() {
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
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
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
        };
        Thread t3 = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread activity 3 started");
                Scanner sc = new Scanner(System.in);
                System.out.println("enter name :");
                String name = sc.nextLine();
                System.out.println("Thread activity 3 ended");

            }
        };

        System.out.println(t1.isAlive()); // false as the thread not yet started bcoz it starts only after we use start()
        System.out.println(t2.isAlive()); // false as the thread not yet started bcoz it starts only after we use start()
        System.out.println(t3.isAlive()); // false as the thread not yet started bcoz it starts only after we use start()


        t1.start();
        t2.start();
        t3.start();

        System.out.println(t1.isAlive()); // true as the thread started bcoz we called start()
        System.out.println(t2.isAlive()); // true as the thread started bcoz we called start()
        System.out.println(t3.isAlive()); // true as the thread started bcoz we called start()

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("closed resources in main thread");
        System.out.println("activity in main thread ended");
    }
}


