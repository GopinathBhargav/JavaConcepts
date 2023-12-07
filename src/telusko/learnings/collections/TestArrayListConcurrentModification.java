
package telusko.learnings.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestArrayListConcurrentModification {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(292);
        list.add(223);
        list.add(212);
        list.add(922);
        list.add(122);
        list.add(212);

        CopyOnWriteArrayList l = new CopyOnWriteArrayList();

        l.add(292);
        l.add(223);
        l.add(212);
        l.add(922);
        l.add(122);
        l.add(212);

        Iterator it = l.iterator();

        while (it.hasNext()) {
            System.out.println( it.next());
            l.add(25);

        }


    }
}
