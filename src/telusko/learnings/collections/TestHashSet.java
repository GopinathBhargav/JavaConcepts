package telusko.learnings.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestHashSet {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add(23);
        hs.add(43);
        hs.add(12);
        hs.add(231);
        hs.add(123);
        hs.add("gopi");
        hs.add(283);
        hs.add(283);
        hs.add(300);
        hs.add("bhargav");

        System.out.println(" hash set values are " +hs); // [23, 231, 43, 123, 283, 12, 300]


        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(23);
        lhs.add(43);
        lhs.add(12);
        lhs.add(231);
        lhs.add(123);
        lhs.add("gopi");
        lhs.add(283);
        lhs.add(283);
        lhs.add(300);
        lhs.add("bhargav");
        System.out.println("linked hash set values are " +lhs);

        Iterator it = lhs.iterator();

        while (it.hasNext()) {
            System.out.println( it.next());
            lhs.add(25);

        }



    }
}
