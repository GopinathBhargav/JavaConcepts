package telusko.learnings.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStreamMap {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(25);
        l.add(35);
        l.add(15);
        l.add(45);
        l.add(55);
        l.add(65);
        //List<Integer> newList = l.stream().map(i->i+5).collect(Collectors.toList());
        // Long count = l.stream().map(i->i+5).count();
        Set<Integer> sort = l.stream().sorted((i1, i2)-> ( i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toSet());
        System.out.println("Verify the sorted list objects " + sort);  // [65, 55, 45, 35, 25, 15]

    }
}