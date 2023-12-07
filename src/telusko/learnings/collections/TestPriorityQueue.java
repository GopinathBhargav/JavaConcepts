package telusko.learnings.collections;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TestPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(10);
        queue.add(14);
        queue.add(4);
        queue.add(9);
        queue.add(14);
        queue.add(21);
        queue.add(6);


        System.out.println(queue);

        TreeSet ts = new TreeSet();
        ts.addAll(queue);
        System.out.println(ts);
    }

}
