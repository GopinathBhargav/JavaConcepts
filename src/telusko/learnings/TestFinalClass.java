package telusko.learnings;

final class FinalMain{

    final int n = 29;
    public void meth(){
        System.out.println("final class method");
    }

}
public class TestFinalClass {

    public static void main(String[] args) {

        FinalMain fm = new FinalMain();
        System.out.println(fm.n);
        fm.meth();

    }
}
