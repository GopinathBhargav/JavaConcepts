package telusko.learnings.innerClass;

class StaticInnerClassDemo{

    public void meth(){
        System.out.println("Top level class");
    }

    static class StaticInnerClassInsideClass{

        void method(){
            System.out.println("inside static inner class ");
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {

        StaticInnerClassDemo st = new StaticInnerClassDemo();
        st.meth();
        StaticInnerClassDemo.StaticInnerClassInsideClass innerSt = new StaticInnerClassDemo.StaticInnerClassInsideClass();
        innerSt.method();

    }
}
