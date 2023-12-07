package telusko.learnings.java8;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentObject{

    String name;
    int marks;

    public StudentObject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class TestFunctionStudentObject {

    public static String meth(StudentObject obj){

        int m = obj.marks;
        String result = m>=80?"Distinction":m<80 && m>=60?"First class":"Fail";
        return result;
    }

    public static void main(String[] args) {

        ArrayList<StudentObject> aList = new ArrayList<>();
        aList.add(new StudentObject("Java", 90));
        aList.add(new StudentObject("Core Java", 80));
        aList.add(new StudentObject("Advance Java", 70));
        aList.add(new StudentObject("Java Mastery", 50));
        aList.add(new StudentObject("python", 70));
        aList.add(new StudentObject("Advance Scripting", 60));

        Function<StudentObject,String> st = obj -> {
            int m = obj.marks;
            String result = m>=80?"Distinction":m<80 && m>=60?"First class":"Fail";
            return result;
        };

       Predicate<StudentObject> res = r -> r.marks>=70;

        for(StudentObject val: aList){
            if(res.test(val)){
                System.out.println(st.apply(val) + "  " + val.name );
            }

        }

        for(StudentObject vals: aList){
            if(res.test(vals)){
                System.out.println( meth(vals)+ "  " + vals.name ); // Here, meth(vals) method will give same output of how we are doing with Function interface, but with Function interface we can directly do all operations instead of writing  a separate method and call
            }

        }

    }
}
