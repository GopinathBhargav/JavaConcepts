package telusko.learnings.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TestComparatorLambdaExp {
    public static void main(String[] args) {

        Comparator<Integer> comparator = (obj1, obj2) -> (obj1<obj2)?1:(obj1>obj2)?-1:0;

        ArrayList<Integer> al = new ArrayList<>();
        al.add(25);
        al.add(15);
        al.add(295);
        al.add(250);
        al.add(22);
        al.add(259);

        TreeSet<Integer> ts = new TreeSet<>((obj1, obj2) -> (obj1<obj2)?1:(obj1>obj2)?-1:0);
        ts.add(25);
        ts.add(15);
        ts.add(295);
        ts.add(250);
        ts.add(22);
        ts.add(259);

        Collections.sort(al,comparator);
        System.out.println("array list elements in descending order " +al);

        System.out.println("Tree set elements in descending order " +ts);

    }

}
