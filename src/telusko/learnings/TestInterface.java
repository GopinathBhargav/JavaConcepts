package telusko.learnings;

interface InterfaceOne{
    
    int interfaceVar = 10;
    void add();
    void sub();
    void mul();
}

interface InterfaceTwo extends InterfaceOne{

    void add();
    void sub();

}
 abstract class InterfaceClass implements InterfaceTwo{

    @Override
    public void sub() {

        System.out.println("sub");
    }
}
public class TestInterface extends InterfaceClass{
    @Override
    public void mul() {
        System.out.println("mul");
    }

    @Override
    public void add() {
        System.out.println("add");
    }



    public static void main(String[] args) {
        InterfaceOne intone = new TestInterface();
        System.out.println(interfaceVar);
        intone.add();
        intone.mul();
        intone.sub();
    }


}
