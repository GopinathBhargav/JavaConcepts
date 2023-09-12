package telusko.learnings;


class SynchronizedExample implements Runnable{

//    @Override
//    synchronized public void run() {
//        try {
//        System.out.println(Thread.currentThread().getName() + " has entered parking");
//        Thread.sleep(3000);
//        System.out.println(Thread.currentThread().getName() + " has entered into the car");
//        Thread.sleep(3000);
//        System.out.println(Thread.currentThread().getName() + " has started driving the car");
//        Thread.sleep(3000);
//        System.out.println(Thread.currentThread().getName() + " has parked the car back into garage");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
     public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " has entered parking");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " has entered into the car");
            Thread.sleep(3000);
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + " has started driving the car");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " has parked the car back into garage");
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
public class TestSynchronized {

    public static void main(String[] args) {
        SynchronizedExample sync = new SynchronizedExample();

        Thread t1 = new Thread(sync);
        Thread t2 = new Thread(sync);
        Thread t3 = new Thread(sync);

        t1.setName("person1");
        t2.setName("person2");
        t3.setName("person3");

        t1.start();
        t2.start();
        t3.start();
    }


}
