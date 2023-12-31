package telusko.learnings;

class ExampleStaticA{

    public static void disp(){
        System.out.println("parent disp()");
    }
}

class ExampleStaticB extends ExampleStaticA{

   // @Override
    public static void disp(){
        System.out.println("child disp()");
    }

}
public class TestStatic {

    public static void main(String[] args) {

        ExampleStaticB stat = new ExampleStaticB();
        stat.disp();

    }
}
