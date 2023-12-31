package telusko.learnings;

 class SuperA{

     int age = 20;

     void methodCall(){
         System.out.println("parent class method");
     }
     SuperA(){
         System.out.println("parent class default constructor");
     }

     SuperA(int num){
         System.out.println("parent class parameter constructor");
     }
}

class SuperB extends SuperA{

     int age = 29;
     SuperB(){
         super(5);

         System.out.println("child class default constructor");
     }

     SuperB(int num, String name){
         System.out.println("child class parameter constructor");

     }

     @Override
    void methodCall(){

         super.methodCall();
        System.out.println("child class method");
    }
     public void methSuper(){

        super.methodCall();
         System.out.println(super.age);

         System.out.println("child class method");
     }

}
public class TestSuper {

    public static void main(String[] args) {

        SuperB sup = new SuperB();
        sup.methodCall();
        sup.methSuper();

    }
}
