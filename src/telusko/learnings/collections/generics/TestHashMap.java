package telusko.learnings.collections.generics;

import java.util.HashMap;
import java.util.WeakHashMap;

class TestGC{

    @Override
   public void finalize(){

        System.out.println("my own gc overrided text");
   }
}
public class TestHashMap {

    public static void main(String[] args) {

        TestGC gc = new TestGC();

        System.out.println(gc);
        //gc=null;
        //System.gc(); // to check the functionality we are just calling gc explicitly so that it calls finalize()

        WeakHashMap<TestGC, Integer> hm = new WeakHashMap<>();
        hm.put(gc, 1);
        gc=null;
        System.gc();
//        WeakHashMap<Integer,TestGC> whm = new WeakHashMap<>();
//
//        whm.put(1,gc);
//        gc=null;
//        System.gc();
    }
}
