package telusko.learnings.collections.generics;


import java.util.ArrayList;

class Generic<T,I,D>{


    T name;
    I age;
    D value;

    public T getName() {
        return name;
    }

    public I getAge() {
        return age;
    }

    public D getValue() {
        return value;
    }

    public void disp(){
        System.out.println("name is " + name.getClass().getName());
        System.out.println("name is " + age.getClass().getName());
        System.out.println("name is " + value.getClass().getName());
    }



    public Generic(T name, I age, D value) {
        this.name = name;
        this.age = age;
        this.value = value;
    }


    public String toString(){
        return name + "   "  + age + "  " + value;
    }


}
public class TestGenerics {

    public static void main(String[] args) {

        Generic<String, Integer, Double> gen1 = new Generic<>("JAN",10,20.5);
        Generic<String, Integer, Double> gen2 = new Generic<>("FEB",15,10.5);
        Generic<String, Integer, Double> gen3 = new Generic<>("MAR",12,40.5);
        gen1.disp();
        System.out.println(gen1.getName());
        System.out.println(gen1.getAge());
        System.out.println(gen1.getValue());

        ArrayList<Generic> list = new ArrayList<>();
        list.add(gen1);
        list.add(gen2);
        list.add(gen3);
        System.out.println(list);
    }
}
