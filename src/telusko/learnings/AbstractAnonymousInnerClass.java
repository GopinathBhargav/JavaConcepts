package telusko.learnings;


//Example 1 --- using abstract class
abstract class AbstractInnerClass{

    abstract void meth();

    void myMeth(){
        System.out.println("concrete method in abstract class");
    }
}

public class AbstractAnonymousInnerClass {

    public static void main(String[] args) {

        AbstractInnerClass anonymous = new AbstractInnerClass() {
            @Override
            void meth() {
                System.out.println("implemented abstract method using anonymous inner class");
            }
        };

        anonymous.meth();
        anonymous.myMeth();

    }
}
