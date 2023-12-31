package telusko.learnings.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamFilter {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(25);
        l.add(35);
        l.add(15);
        l.add(45);
        l.add(55);
        l.add(65);
        //List<Integer> newList = l.stream().filter(i->i>35).collect(Collectors.toList());
        Long newList = l.stream().filter(i->i>35).count();
        System.out.println("Verify by counting the number of object values which are greater than 35 " + newList);  // 3
    }
}
