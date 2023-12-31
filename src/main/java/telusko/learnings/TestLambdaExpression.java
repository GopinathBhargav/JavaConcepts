package telusko.learnings;


interface LambdaEX{

    //void run();
    int run(int num);
    default void method(){
        System.out.println("default meth in interface");
    }

    static void meth(){
        System.out.println("static meth in interface");
    }
}
public class TestLambdaExpression {

    public static void main(String[] args) {

        LambdaEX ex = ( n) ->  n * n;
        int number = ex.run(4);
        ex.method();
        LambdaEX.meth();
        System.out.println(number);
        //main(args); stackover flow error - recursive function
    }
}
