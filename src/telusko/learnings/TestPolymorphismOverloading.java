package telusko.learnings;

class OverloadA{

    public void method1(){
        System.out.println("no arguments method");
    }
}

class OverloadB extends OverloadA{

    public void method1(int number){
        System.out.println("arguments method with value");
    }

}
public class TestPolymorphismOverloading {

    public static void main(String[] args) {
        OverloadB b =new OverloadB();
        b.method1();
        b.method1(1);
    }


}
