package telusko.learnings;

class ExceptionHandlingDemo{

    void checkException() {
        System.out.println("statement 1");
        try {
            System.out.println("statement 2");
            //System.exit(0);
            int n = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("please enter the value of denominator apart from 0");
            e.printStackTrace(); // stack trace will be printed after the whole program gets executed
        }
        finally{
            System.out.println("statement 3");
        }

    }

    void arrayIndexBoundException() {

        try {
            int n[] = new int[5];
            n[6] = 90;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please enter the array index with max length of array -1");

        }

    }

}
public class TestExceptions {

    public static void main(String[] args) {

        ExceptionHandlingDemo demo = new ExceptionHandlingDemo();

            demo.checkException();
            System.out.println("check if this line executes after arithemtic exception");
            demo.arrayIndexBoundException();
            System.out.println("check if this line executes after array index out of bound exception");

    }
}
