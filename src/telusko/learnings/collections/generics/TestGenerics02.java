package telusko.learnings.collections.generics;


import java.util.ArrayList;

class Generics<T>{

    T value;
    T name;
    T age;

    public T getName() {
        return name;
    }

    public T getAge() {
        return age;
    }

    public T getValue() {
        return value;
    }

    public Generics(T name, T age, T value) {
        this.name = name;
        this.age = age;
        this.value = value;
    }




    public void disp(){
        System.out.println("name is " + name.getClass().getName());
        System.out.println("name is " + age.getClass().getName());
        System.out.println("name is " + value.getClass().getName());
    }


    public String toString(){
        return name + "   "  + age + "  " + value;
    }


}
public class TestGenerics02 {

    public static void main(String[] args) {

        Generics<String> gen1 = new Generics<>("JAN","10","20.5");
        Generics<String> gen2 = new Generics<>("FEB","15","10.5");
        Generics<String> gen3 = new Generics<>("MAR","12","40.5");
        gen1.disp();
        System.out.println(gen1.getName());
        System.out.println(gen1.getAge());
        System.out.println(gen1.getValue());

        ArrayList<Generics> list = new ArrayList<>();
        list.add(gen1);
        list.add(gen2);
        list.add(gen3);
        System.out.println(list);
    }
}
