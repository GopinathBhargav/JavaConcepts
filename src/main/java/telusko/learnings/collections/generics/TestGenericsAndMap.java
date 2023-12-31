package telusko.learnings.collections.generics;

import java.util.HashMap;

class GenericMap{

    String name;
    int age;
    int id;
    public GenericMap(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String toString(){

        return name + " " + age + " "+ id;
    }

}
public class TestGenericsAndMap {

    public static void main(String[] args) {

        GenericMap map1 = new GenericMap("java", 25, 1995);
        GenericMap map2 = new GenericMap("javaScript", 20, 2000);
        HashMap<Integer,GenericMap> map = new HashMap<>();
        map.put(1,map1);
        map.put(2,map2);
        System.out.println(map);

        HashMap<GenericMap, String> maps = new HashMap<>();
        maps.put(map1, "A");
        maps.put(map2,"B");
        System.out.println(maps);
        System.out.println(maps.get(map1));


    }

}
