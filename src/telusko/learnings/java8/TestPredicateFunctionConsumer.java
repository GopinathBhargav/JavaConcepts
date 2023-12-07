package telusko.learnings.java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentObj{

    String name;
    int marks;

    public StudentObj(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class TestPredicateFunctionConsumer {

    public static void main(String[] args) {

        ArrayList<StudentObj> aList = new ArrayList<>();
        aList.add(new StudentObj("Java", 90));
        aList.add(new StudentObj("Core Java", 80));
        aList.add(new StudentObj("Advance Java", 70));
        aList.add(new StudentObj("Java Mastery", 50));
        aList.add(new StudentObj("python", 70));
        aList.add(new StudentObj("Advance Scripting", 60));

        // Here, Function is used to check the operation
        Function<StudentObj,String> st = obj -> {
            int m = obj.marks;
            String result = m>=80?"Distinction":m<80 && m>=60?"First class":"Fail";
            return result;
        };

        // Here, Predicate is used to check condition if marks >= 80
        Predicate<StudentObj> res = r -> r.marks>=80;

        // Here, Consumer is used to print student name
        Consumer<StudentObj>  cons = c -> System.out.println(st.apply(c) +  "  " + c.name);

        for(StudentObj val: aList){
            if(res.test(val)){
                cons.accept(val);
            }

        }
    }
}

