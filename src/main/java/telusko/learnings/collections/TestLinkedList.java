package telusko.learnings.collections;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        l.add(29);
        l.add(209);
        l.add(19);
        l.add(209);
        l.add(299);
        l.add(209);
        l.add(-19);



        System.out.println("elements in list " +l);

        l.removeFirstOccurrence(209);

        System.out.println("elements after removing first Occurrence " +l);

        l.removeLastOccurrence(209);

        System.out.println("elements after removing last Occurrence " +l);
    }
}
