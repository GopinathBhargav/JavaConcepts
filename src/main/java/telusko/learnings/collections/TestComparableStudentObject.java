package telusko.learnings.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;


class StudentDetails implements Comparable<StudentDetails>{

    int rollNo;
    int age;
    String name;

    public StudentDetails(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return name + " " + age + " " + rollNo;
    }

    @Override
    public int compareTo(StudentDetails that) {
        return that.name.compareTo(this.name); // to sort based on name
        // this.age > that.age ? 1:this.age<that.age?-1:0 // to sort based on age
    }

}
public class TestComparableStudentObject {
    public static void main(String[] args) {


        List<StudentDetails> al = new ArrayList<>();

        al.add(new StudentDetails(34,23,"Apple"));
        al.add(new StudentDetails(24,19,"Samsung"));
        al.add(new StudentDetails(21,45,"Huawei"));

        TreeSet<StudentDetails> ts = new TreeSet<>();
        ts.add(new StudentDetails(34,23,"Apple"));
        ts.add(new StudentDetails(24,19,"Samsung"));
        ts.add(new StudentDetails(21,45,"Huawei"));

        Collections.sort(al);
        System.out.println("array list elements " + al);

        System.out.println("Tree set elements" + ts);

    }


}
