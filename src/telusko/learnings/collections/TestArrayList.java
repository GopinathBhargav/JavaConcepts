
package telusko.learnings.collections;

import java.util.*;

public class TestArrayList {

    public static void main(String[] args) {

        List l = new ArrayList();
        l.add("a");
        System.out.println(l);
        ArrayList list = new ArrayList();
        list.add("b");
        System.out.println(list);
        list.addAll(l);
        System.out.println(list);

        for(int i=0; i< l.size();i++){

            System.out.println( l.get(i));
            //l.add("sd");
        }


        for( Object obj : l){
            System.out.println(obj);
            //l.add(122);
        }

       Iterator it =  l.iterator();
        while(it.hasNext()){

            it.next();
           // l.add(122);
        }

        Collections.sort(l);
        System.out.println(l);



    }
}
