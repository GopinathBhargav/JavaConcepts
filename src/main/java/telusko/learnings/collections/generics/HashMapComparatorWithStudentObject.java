package telusko.learnings.collections.generics;

import java.util.*;

class MyTestMapComparator{
    int rollNo;
    int age;
    String name;

    public MyTestMapComparator(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return name + " " + age + " " + rollNo;
    }
}
public class HashMapComparatorWithStudentObject {

    public static void main(String[] args) {

        HashMap<Integer, MyTestMapComparator> hMap = new HashMap<>();
        hMap.put(13,new MyTestMapComparator(34, 21, "Java"));
        hMap.put(3,new MyTestMapComparator(14, 1, "Bava"));
        hMap.put(93,new MyTestMapComparator(19, 27, "Lava"));
        hMap.put(43,new MyTestMapComparator(44, 51, "Mawa"));

        LinkedHashMap<Integer, MyTestMapComparator> linkedMap = new LinkedHashMap<>();
        ArrayList<MyTestMapComparator> aList = new ArrayList<>();

        for( Map.Entry<Integer, MyTestMapComparator> data :hMap.entrySet()){
            aList.add(data.getValue());
        }

        Comparator<MyTestMapComparator> comparator = (a1,a2) -> a1.age<a2.age?-1:a1.age>a2.age?1:0;
        Collections.sort(aList,comparator);

        for( MyTestMapComparator list : aList ){

            for( Map.Entry<Integer, MyTestMapComparator> data : hMap.entrySet()){

                if(list.age == data.getValue().age){
                    linkedMap.put(data.getKey(),data.getValue());
                }
            }

        }

        System.out.println("Sorted map based on age is " + linkedMap);

    }

}
