package telusko.learnings;

class Producers implements Runnable {

    InterThreads th = new InterThreads();

    @Override
    public void run() {

        System.out.println("value of the refrence in producer run is " + th);
        int i=1;
        while(true){
            th.put(i++);
        }


    }
}

class Consumers implements Runnable {

    InterThreads th = new InterThreads();

    @Override
    public void run() {
        System.out.println("value of the reference in consumer run is " + th);
        while(true){
           th.get();
        }

    }
}

class InterThreads {

    int value;
    boolean flag = false;
    synchronized public void put(int i) {

        try{
            if(flag == true){
                wait();
            }else{
                value = i;
                System.out.println("The value produced is :" + value);
                flag=true;
                notify();
            }
        }catch(Exception e){
            System.out.println("Exception in put method");
        }


    }

    synchronized public void get() {

        try{
            if(flag == false){
                wait();
            }else{
                System.out.println("The value consumed is :" + value);
                flag=false;
                notify();
            }
        }catch(Exception e){
            System.out.println("Exception in get method");
        }


    }

}

public class TestInterThreadCommunication02 {

    public static void main(String[] args) {


        Producers pros = new Producers();
        Consumers cons = new Consumers();

        Thread t1 = new Thread(pros);
        Thread t2 = new Thread(cons);

        t1.start();
        t2.start();
    }


}
