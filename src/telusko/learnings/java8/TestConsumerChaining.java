package telusko.learnings.java8;

import java.util.function.Consumer;

class ConsumerDetails{

    public ConsumerDetails(String name) {
        this.name = name;
    }
    String name;
}
public class TestConsumerChaining {

    public static void main(String[] args) {

        ConsumerDetails c = new ConsumerDetails("Java");

        Consumer<ConsumerDetails> c1 = cd -> System.out.println(cd.name + " is an object oriented language");
        Consumer<ConsumerDetails> c2 = cd -> System.out.println(cd.name + " 1.8 introduced functional programming");
        Consumer<ConsumerDetails> c3 = cd -> System.out.println(cd.name + " - verifying consumer chaining concept");

        c1.andThen(c2).andThen(c3).accept(c);

    }

}
