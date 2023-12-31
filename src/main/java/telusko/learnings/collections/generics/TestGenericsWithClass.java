package telusko.learnings.collections.generics;

import java.util.ArrayList;

class Person{

    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + "   "  + age;
    }

}
public class TestGenericsWithClass {

    public static void main(String[] args) {

        Person p1 = new Person("Jan", 01);
        Person p2 = new Person("Feb", 02);

        ArrayList<Person> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);

        System.out.println(list);
    }


}
