package telusko.learnings.innerClass;


//Example 1 --- using abstract class
 interface InterfaceInnerClass{

    abstract void meth();

    default void myMeth(){
        System.out.println("default method in interface");
    }

    default void myMethInterface(){
        System.out.println("default method in interface, not overridden in anonymous class");
    }

}

public class InterfaceAnonymousInnerClass {

    public static void main(String[] args) {


        InterfaceInnerClass anonymous = new InterfaceInnerClass() {
            @Override
            public void meth() {
                System.out.println("implemented abstract method using anonymous inner class");
            }
            @Override
            public void myMeth(){
                System.out.println("overridden default method from interface");
            }
        };

        anonymous.meth();
        anonymous.myMeth();
        anonymous.myMethInterface();




    }
}
