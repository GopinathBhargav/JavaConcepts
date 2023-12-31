package telusko.learnings.collections;

import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        TreeSet t = new TreeSet();
        t.add(23);
        t.add(91);
        t.add(100);
        t.add(88);
        t.add(1);
        t.add(120);
        t.add(34);
        t.add(57);
        System.out.println(t); // [1, 23, 34, 57, 88, 91, 100, 120]
        System.out.println(t.ceiling(91)); // 91
        System.out.println(t.higher(91)); // 100
        System.out.println(t.floor(91)); // 91
        System.out.println(t.lower(91)); // 88
        System.out.println(t.higher(140)); // null
        System.out.println(t.lower(0)); // null

        System.out.println(" accessing collection values ");
        TreeSet ts = new TreeSet();
        ts.add(new StringBuffer("a"));
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("C"));
        ts.add(new StringBuffer("c"));

        System.out.println(" accessing collection values in string buffer " + ts);

        for( Object obj : t){
            System.out.println(obj);
            t.add(122);
        }
    }
}
