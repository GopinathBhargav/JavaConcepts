package telusko.learnings;


interface InterfaceStatic{

     static void main(){
        System.out.println("static....method");
    }

     static void main(String[] args) {
        System.out.println("its psvm inside interface");
       // main();
    }

}
public class TestInterfaceStaticMethod implements InterfaceStatic{

    public static void main(String[] args) {

        InterfaceStatic.main();
        InterfaceStatic.main(new String[2]);

    }
}
