package telusko.learnings.java8;


import java.util.ArrayList;
import java.util.function.Predicate;

class EmployeeTest{

    int salary;
    String name;

    public EmployeeTest(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }


}
public class TestPredicate {

    public static void main(String[] args) {

        ArrayList<EmployeeTest> al = new ArrayList<>();
        al.add(new EmployeeTest(2000, "java"));
        al.add(new EmployeeTest(5000, "python"));
        al.add(new EmployeeTest(3000, "javascript"));
        al.add(new EmployeeTest(1000, "c"));
        al.add(new EmployeeTest(1800, "c#"));

        //System.out.println(al);

        Predicate<EmployeeTest> p = emp -> emp.salary>2000;
        Predicate<EmployeeTest> p1 = e -> e.name.length()>5;
        Predicate<EmployeeTest> p2 = e1 -> e1.salary==3000;

        for(EmployeeTest val : al){

            if(p.and(p1).and(p2).test(val)){
                System.out.println(val.name + " " + val.salary);
            }
        }



    }
}
