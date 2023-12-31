package telusko.learnings;

class DeadLock implements Runnable{

    String book1 = "core java";
    String book2 = "adv java";
    String book3 = "spring boot";
    @Override
    public void run() {

        String currentThread = Thread.currentThread().getName();
        if("student1".equals(currentThread)){
            try{
                Thread.sleep(4000);
                synchronized (book1){
                    System.out.println("student 1 has took the book of " + book1);
                    Thread.sleep(4000);
                    synchronized (book2){
                        System.out.println("student 1 has took the book of " + book2);
                        Thread.sleep(4000);
                        synchronized (book3){
                            System.out.println("student 1 has took the book of " + book3);
                            Thread.sleep(4000);
                        }
                    }
                }
            }catch(Exception e){
                System.out.println("Exception occurred for student 1 conditions");
            }


        }else{
            try{
                Thread.sleep(4000);
                synchronized (book3){
                    System.out.println("student 2 has took the book of " + book3);
                    Thread.sleep(4000);
                    synchronized (book2){
                        System.out.println("student 2 has took the book of " + book2);
                        Thread.sleep(4000);
                        synchronized (book1){
                            System.out.println("student 2 has took the book of " + book1);
                            Thread.sleep(4000);
                        }
                    }
                }
            }catch(Exception e){
                System.out.println("Exception occurred for student 2 conditions");
            }
        }
    }
}
public class TestDeadLock {

    public static void main(String[] args) {

        DeadLock lock = new DeadLock();

        Thread t1 = new Thread(lock);
        Thread t2 = new Thread(lock);

        t1.setName("student1");
        t2.setName("student2");

        t1.start();
        t2.start();

    }
}
