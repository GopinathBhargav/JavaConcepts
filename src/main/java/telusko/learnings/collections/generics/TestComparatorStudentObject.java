package telusko.learnings.collections.generics;

import java.util.*;

class StudentObject{

    int rollNo;
    int age;
    String name;

    public StudentObject(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return name + " " + age + " " + rollNo;
    }
}
public class TestComparatorStudentObject {

    public static void main(String[] args) {


        Comparator<StudentObject> obj = (obj1, obj2) -> obj1.rollNo>obj2.rollNo?1:obj1.rollNo<obj2.rollNo?-1:0;
        Comparator<StudentObject> object = (obj1, obj2) -> obj1.name.compareTo(obj2.name);

        List<StudentObject> al = new ArrayList<>();

        al.add(new StudentObject(34, 23, "Apple"));
        al.add(new StudentObject(24, 19, "Samsung"));
        al.add(new StudentObject(21, 45, "Huawei"));

        TreeSet<StudentObject> ts = new TreeSet<>(obj);
        ts.add(new StudentObject(34, 23, "Apple"));
        ts.add(new StudentObject(24, 19, "Samsung"));
        ts.add(new StudentObject(21, 45, "Huawei"));


        Collections.sort(al, obj);
        System.out.println("array list elements for rollNo sorting" + al);
        Collections.sort(al,object);
        System.out.println("array list elements for name sorting " + al);

        System.out.println("Tree set elements" + ts);
    }
}
