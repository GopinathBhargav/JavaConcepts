package telusko.learnings;

class A{

     int num;
     int res;

    public int add(int i, int i1) {

        res = i + i1;
        System.out.println("adding 2 values is " + res);
        return res;

    }
    public int sub(int i, int i1) {

        res = i - i1;
        System.out.println("subtract 2 values is " + res);
        return res;
    }
}

class B {

    int num;
    int res;

    public int getAddMethodValue(){
         A a = new A();
        return a.add(2, 4);
    }

    public int getSubMethodValue(){
        A a = new A();
        int sub = a.sub(3,1);
        return sub;
    }
    public int multiply() {
        res = getAddMethodValue() * getSubMethodValue();
        System.out.println("multiply 2 values is " + res);
        return res;
    }

}
public class TestWithoutInheritance {

    public static void main(String[] args) {
        B b = new B();
        b.multiply();

    }
}
