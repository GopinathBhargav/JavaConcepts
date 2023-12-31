package telusko.learnings;

class Producer implements Runnable {

    InterThread th;
    public Producer(InterThread it) {
        th = it;
    }

    @Override
    public void run() {

        int count = 1;
        while (true) {
            th.put(count++);
        }

    }
}

class Consumer implements Runnable {

    InterThread th;

    public Consumer(InterThread it) {

        th = it;
    }

    @Override
    public void run() {

        while (true) {
            th.get();

        }
    }
}

class InterThread {

    int value;
    boolean flag = false;

    synchronized public void put(int i) {

        try {
            if (flag == true) {
                wait();
            } else {
                value = i;
                System.out.println("The value produced is :" + value);
                flag = true;
                notify();
            }
        } catch (Exception e) {
            System.out.println("Exception in put method");
        }


    }

    synchronized public void get() {

        try {
            if (flag == false) {
                wait();
            } else {
                System.out.println("The value consumed is :" + value);
                flag = false;
                notify();
            }
        } catch (Exception e) {
            System.out.println("Exception in get method");
        }


    }

}

public class TestInterThreadCommunication {

    public static void main(String[] args) {

        InterThread it = new InterThread();
        Producer pro = new Producer(it);
        Consumer con = new Consumer(it);

        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(con);

        t1.start();
        t2.start();
    }


}
