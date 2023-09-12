package telusko.learnings;

class Person{

    int age;
    String name;

    public Person(){
        this("Bhargav");
        System.out.println("default constructor call");
    }

    public Person(String name){
        System.out.println("single parameter constructor call and name is " + name);
    }
    public Person(int age, String name) {

        this();
        this.age = age;
        this.name = name;
        System.out.println("parameter constructor call");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
public class TestConstructor {

    public static void main(String[] args) {

        //Person c = new Person();
        Person c1 = new Person(2, "Gopi");
        int ageValue = c1.getAge();
        System.out.println(ageValue);
        System.out.println(c1.getName());


    }
}
