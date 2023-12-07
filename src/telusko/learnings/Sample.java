package telusko.learnings;

class SampleTest{

    String name;
    int sal;

    void work1(){

        int age = 20;
        sal =100;
        System.out.println(age + " " + sal);
    }

    void work2(){

        int age = 30;
        sal =400;
        System.out.println(age + " " + sal);
    }
}
public class Sample {

    public static void main(String[] args) {

        SampleTest test = new SampleTest();
        test.name = "java";
        System.out.println(test.name);
        test.work1();
        test.work2();
        System.out.println(test.sal = 5000);

    }
}
