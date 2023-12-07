package telusko.learnings.collections.generics;

import java.util.*;

public class TestMap {

    public static void main(String[] args) {

        Map<Integer,String> map= new HashMap<>();
        map.put(20, "Java");
        map.put(null, "ASD");
        map.put(null, "ABD");
        map.put(21, null);
        map.put(31, null);
        map.put(9, null);
        System.out.println(map);

        Map<Integer,String> hash= new Hashtable<>();
        hash.put(20, "Java");
        hash.put(21, "ASD");
        hash.put(11, "ABD");
//        //hash.put(21, null);
//        hash.put(31, null);
//        hash.put(9, null);
        System.out.println(hash);

        Iterator<Map.Entry<Integer,String>> entry =map.entrySet().iterator();

        while(entry.hasNext()){

            Map.Entry<Integer,String> ent = entry.next();
            Integer key = ent.getKey();

            String value = ent.getValue();
            System.out.println("key is " + key + " value is " + value);
        }
    }
}
