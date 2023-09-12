package telusko.learnings;

class ClassA{

    public void meth(){
        System.out.println("class A");
    }

    class InnerClassBInsideClassA{

        final float pi = 3.14f;
        void method(){
            System.out.println("inside inner class A");
        }

        InnerClassBInsideClassA(){
            System.out.println("Its default constructor with pi value is " + pi);
        }
    }
}
public class MemberInnerClass {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.meth();
        ClassA.InnerClassBInsideClassA innerClass = a.new InnerClassBInsideClassA();
        innerClass.method();
    }


}
