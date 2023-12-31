package telusko.learnings;

class ExceptionReThrowHandlingDemo {

    void checkException() throws Exception {

        try {

            int n = 10 / 0;
        } catch (ArithmeticException e) {

            throw e;
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

public class TestRethrowExceptions {

    public static void main(String[] args) throws Exception {

        ExceptionReThrowHandlingDemo demo = new ExceptionReThrowHandlingDemo();

        try{
            demo.checkException();
            System.out.println("check if this line executes after arithemtic exception");
        }catch(Exception e){
            System.out.println("Its handled");
        }


        demo.arrayIndexBoundException();
        System.out.println("check if this line executes after array index out of bound exception");
    }
}
