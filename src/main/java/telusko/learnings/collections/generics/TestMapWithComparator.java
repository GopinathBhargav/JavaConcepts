package telusko.learnings.collections.generics;

import java.util.HashMap;
import java.util.TreeMap;

class TestMapStudent implements Comparable<TestMapStudent>{

    int rollNo;
    int age;
    String name;

    public TestMapStudent(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return name + " " + age + " " + rollNo;
    }

    @Override
    public int compareTo(TestMapStudent that) {

        return this.age > that.age ? 1 : this.age < that.age ? -1 : 0;
    }

}
public class TestMapWithComparator {
    public static void main(String[] args) {

        TreeMap<Integer, TestMapStudent> hm = new TreeMap<>();
        hm.put(1, new TestMapStudent(23, 24, "Java"));
        hm.put(20, new TestMapStudent(13, 4, "Canada"));
        hm.put(13, new TestMapStudent(43, 44, "USA"));

        //TreeMap<Integer, TestMapStudent> tm = new TreeMap<>();


        //tm.putAll(hm);
        System.out.println(hm);
    }
}
