package telusko.learnings.java8;

import java.util.function.Function;

public class TestFunctionInterafce {

    public static void main(String[] args) {

        Function<String,Integer> fn = s -> s.length();
        Integer i = fn.apply("java");
        System.out.println(i);

    }
}
