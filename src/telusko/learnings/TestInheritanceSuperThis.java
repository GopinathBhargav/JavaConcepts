package telusko.learnings;

class ParentClass{



    int num = 10;

     int res;

    public ParentClass(){

        this(2,4);
        System.out.println("Its parent class constructor");
    }

    public ParentClass(int i, int i1) {

        res = i + i1;
        System.out.println("adding 2 values is " + res);

    }

    public int parentClassMethod(int i, int i1) {

        res = i + i1;
        System.out.println("adding 2 values is " + res);
        return res;

    }
}

class ChildClass extends ParentClass{

    int num = 9;

    public ChildClass(){
        // by default super called here
        System.out.println("value of instance variable res in parent class before adding values is " + super.res);
        super.parentClassMethod(20,30);

        int num = 5;
        System.out.println("value of local variable num is " + num);
        System.out.println("value of instance variable num is " + this.num);
        System.out.println("value of instance variable num in parent class is " + super.num);
        System.out.println("value of instance variable res in parent class after adding values is " + super.res);
        meth();

    }


    public void meth(){
        System.out.println("value of instance variable res in parent class before adding values is " + super.res);
    }


}
public class TestInheritanceSuperThis {

    public static void main(String[] args) {

        ChildClass child = new ChildClass();

    }
}
