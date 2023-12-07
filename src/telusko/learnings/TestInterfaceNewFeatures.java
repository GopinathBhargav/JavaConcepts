package telusko.learnings;

interface InterfaceA {

    abstract void meth();

    default void method1() {
        System.out.println("default method in interfaceA");
    }

    private void method2() {
        System.out.println("private method in interfaceA");
    }
}

interface InterfaceB extends InterfaceA {
    @Override
    default void method1() {

        System.out.println("overridden default method from interface a to interface b");
    }
}

class ClassC implements InterfaceB {

    @Override
    public void meth() {

        System.out.println("Implemented abstract method in interface");
    }
}

public class TestInterfaceNewFeatures {
    public static void main(String[] args) {
        InterfaceA c = new ClassC();
        c.meth();
        c.method1();
        //c.method2();

    }
}
