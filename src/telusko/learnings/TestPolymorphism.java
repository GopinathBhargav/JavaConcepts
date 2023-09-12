package telusko.learnings;


class Polymorphism{

    public void method(){
        System.out.println("parent class method");
    }
}

class PolymorphismB extends Polymorphism{

    @Override
    public void method(){
        System.out.println("child 1 class method");
    }

    public void meth(){
        super.method();
    }

}

class PolymorphismC extends PolymorphismB{
    @Override
    public void method(){
        System.out.println("child 2 class method");
    }


}

class PolymorphismTest{

    public void takeClassRef(Polymorphism ref){
       /*  this method created only once but calling
         multiple times with help of reference type which is
         nothing but run time polymorphism */

        ref.method();
        //ref.meth();

    }

}
public class TestPolymorphism {

    public static void main(String[] args) {

        PolymorphismTest poly = new PolymorphismTest();
        Polymorphism p = new Polymorphism();
        PolymorphismB p1 = new PolymorphismB();
        PolymorphismB p2 = new PolymorphismB();


        poly.takeClassRef(p);
        poly.takeClassRef(p1);
        poly.takeClassRef(p2);

        // downcasting by calling child class method from parent class refernce
        Polymorphism polyB = new PolymorphismB();
        ((PolymorphismB) polyB).meth();
    }

}

