package telusko.learnings;

abstract class AbstractParent{

     int a = 10;
    public void display(){
        System.out.println("Its display method in Abstract parent class");
    }

    abstract void firstAbstractMethod();


}

class ConcreteChild extends AbstractParent{

    @Override
    void firstAbstractMethod() {
        System.out.println("overridden abstract method from parent class");
    }
}

 class Abstraction{


    public void takeRef(AbstractParent ref){
        ref.firstAbstractMethod();
        ref.display();
    }
}

public class TestAbstract {

    public static void main(String[] args) {
        ConcreteChild child = new ConcreteChild();
//        child.firstAbstractMethod();
//        child.display();
        //System.out.println(child.a);

        // instantiate abstract class - we should get compile time error
        //AbstractParent p = new AbstractParent();

        AbstractParent parent = new ConcreteChild();
//        parent.firstAbstractMethod();
//        parent.display();

        // AbstractParent pa = new ConcreteChild();

        Abstraction a = new Abstraction();
        a.takeRef(child);
        a.takeRef(parent);
    }


}
