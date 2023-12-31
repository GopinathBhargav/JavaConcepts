
package telusko.learnings.collections;

import java.util.*;

public class TestArrayListExample2 {

    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(292);
        l.add(223);
        l.add(212);
        l.add(922);
        l.add(122);
        l.add(212);

        Iterator it = l.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            Integer val = (Integer) obj;
            if (val % 2 != 0)
                it.remove();
        }
        System.out.println(l);

//        ListIterator lit =  l.listIterator();
//        while(lit.hasNext()){
//            //System.out.println(lit.nextIndex());
//            //System.out.println(lit.next());
//            System.out.println(lit.nextIndex());
//        }


        System.out.println(l);

        TreeSet ts = new TreeSet();
        ts.addAll(l);
        System.out.println(ts);

        TreeSet tss = new TreeSet(l);
        ts.addAll(l);
        System.out.println(ts);

    }
}
