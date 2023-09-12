package telusko.learnings.collections;

import java.util.Collections;
import java.util.HashSet;

public class TestHashSet {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add(23);
        hs.add(43);
        hs.add(12);
        hs.add(231);
        hs.add(123);
        hs.add(283);
        hs.add(283);
        hs.add(300);
        System.out.println(hs); // [23, 231, 43, 123, 283, 12, 300]


    }
}
