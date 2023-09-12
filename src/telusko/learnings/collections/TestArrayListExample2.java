
package telusko.learnings.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TestArrayListExample2 {

    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(292);
        l.add(223);
        l.add(212);
        l.add(922);
        l.add(122);
        l.add(212);


        System.out.println(l);

        TreeSet ts = new TreeSet();
        ts.addAll(l);
        System.out.println(ts);

    }
}
