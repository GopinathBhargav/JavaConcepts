package telusko.learnings.java8;

import java.util.function.Function;

public class TestFunctionChaining {

    public static void main(String[] args) {

        Function<Integer,Integer> fn1 = i-> i + 5;
        Function<Integer,Integer> fn2 = j-> j * j;

        System.out.println(fn1.andThen(fn2).apply(10)); // if we use .andThen priority will be given to left side reference first which is fn1 followed by right side which is fn2
        System.out.println(fn1.compose(fn2).apply(10)); // if we use .compose priority will be given to right side reference first which is fn2 followed by right side which is fn1
        System.out.println(fn1.andThen(fn2).compose(fn2).apply(10));
        System.out.println(fn1.andThen(fn2).compose(fn1).apply(10));
    }
}
