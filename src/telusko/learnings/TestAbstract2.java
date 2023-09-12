package telusko.learnings;

 class AbstractParent1{

    int a = 10;
    public void display(){
        System.out.println("Its display method in Abstract parent class");
    }

      //final abstract void firstAbstractMethod2();


}

abstract class ConcreteChild1 extends AbstractParent1{

    abstract void firstAbstractMethod();

}

class GrandChild extends ConcreteChild1{

    @Override
    void firstAbstractMethod() {
        System.out.println("implemented abstract method from parent class");
    }
}
 class Abstraction1{


    public void takeRef(AbstractParent1 ref){
        //ref.firstAbstractMethod();
        ref.display();
    }
}

public class TestAbstract2 {

    public static void main(String[] args) {

        AbstractParent1 parent;
        parent = new GrandChild();
        ((GrandChild) parent).firstAbstractMethod();

    }


}
