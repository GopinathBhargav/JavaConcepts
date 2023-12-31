package telusko.learnings;

import java.util.Scanner;

class ThreadActivity1 implements Runnable{

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
}

class ThreadActivity2 implements Runnable{

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
}

class ThreadActivity3 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread activity 3 started");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name :");
        String name = sc.nextLine();
        System.out.println("Thread activity 3 ended");

    }
}
public class TestMultiThreading {

    public static void main(String[] args) {

        System.out.println(" activity 1 started");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name :");
        String name = sc.nextLine();
        System.out.println("Thread activity 3 ended");

       Thread thread = Thread.currentThread();
       String threadName = thread.getName();
        System.out.println("name of first current thread in psvm is " + threadName);
        int defaultPriority = thread.getPriority();
        System.out.println("default priority of main thread is " + defaultPriority);
        thread.setName("MY_NEW_THREAD");
        String newThreadName = thread.getName();
        System.out.println("name of new thread in psvm is " + newThreadName);
        thread.setPriority(8);
        int newPriority = thread.getPriority();
        System.out.println("new priority of main thread is " + newPriority);

        ThreadActivity1 t1 = new ThreadActivity1();
        ThreadActivity2 t2 = new ThreadActivity2();
        ThreadActivity3 t3 = new ThreadActivity3();

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();
        th2.start();
        th3.start();

    }
}
