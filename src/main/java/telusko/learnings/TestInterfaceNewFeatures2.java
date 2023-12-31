package telusko.learnings;

interface FirstInterface{

    default void methodA(){
        System.out.println("default method in FirstInterface");
    }
}
interface SecondInterface{
    default void methodA(){
        System.out.println("default method in SecondInterface");
    }
}
class NewClass implements FirstInterface, SecondInterface{


    @Override
    public void methodA() {
        SecondInterface.super.methodA();
    }

}
public class TestInterfaceNewFeatures2 {

    public static void main(String[] args) {

        NewClass c= new NewClass();
        c.methodA();
    }
}
