package telusko.learnings.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamsMinMax {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("VGB");
        l.add("ABC");
        l.add("DEF");
        l.add("AVGB");
        l.add("VGBF");

        List<String> sortedAscList = l.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedAscList); // [ABC, AVGB, DEF, VGB, VGBF]
        String min = l.stream().min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println("min value in list is " + min); // ABC
        String max = l.stream().max((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println("max value in list is " + max); // VGBF

    }
}
