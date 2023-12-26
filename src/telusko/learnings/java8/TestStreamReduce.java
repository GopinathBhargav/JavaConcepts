package telusko.learnings.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStreamReduce {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,5,9,7,6,4);

        Integer i = list
                .stream()
                .filter(x->x%2==0)
                .map(x->x*2)
                .reduce(0,(a,b) -> a+b);

        System.out.println(i);

    }
}
