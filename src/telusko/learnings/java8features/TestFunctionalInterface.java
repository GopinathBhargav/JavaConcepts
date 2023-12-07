package telusko.learnings.java8features;

@java.lang.FunctionalInterface
interface FunctionalInterfaceDemo{
    public void m1(int a, int b, float c);
    default void m2(){
        System.out.println("default method in functional interface");
        m3();
    }
    private void m3(){
        System.out.println("private method in functional interface");
    }
}
public class TestFunctionalInterface {

    public static void main(String[] args) {

        FunctionalInterfaceDemo fid = (d, e, f)
                -> System.out.println("Functional interface invocation using Lambda Expression" + "a value is :" +d + ", b value is :"+d+", c value is: "+f);
        fid.m1(10,20,30.567f);
        fid.m2();

    }

}
