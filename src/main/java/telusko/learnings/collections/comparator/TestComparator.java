package telusko.learnings.collections.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {

    public static void main(String[] args) {

        StudentDetails student1 = new StudentDetails("gopi");
        StudentDetails student2 = new StudentDetails("Bhargav", 24);
        StudentDetails student3 = new StudentDetails("zeroDegree", 27, 2);

        ArrayList list = new ArrayList();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println("Array list objects before sorting:  "+list);

        /*
         approach 1 - create a class and implementing Comparator interface
         StudentObjectComparision comparision = new StudentObjectComparision();
         */

        /*
        approach 2 - anonymous inner class

        Comparator<StudentDetails> comparision = new Comparator<StudentDetails>() {
            @Override
            public int compare(StudentDetails o1, StudentDetails o2) {
                if(o1.getAge() > o2.getAge())
                    return 1;
                else
                    return -1;
            }
        };
        */

        // approach 3 - using lambda expression
        Comparator<StudentDetails> comparision = (StudentDetails o1, StudentDetails o2) ->{

            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            } else {
                return 0;
            }

        };

        Collections.sort(list, comparision); // whenever we call comparator object reference it will directly call compare(), we dont need to call them.
        System.out.println("Array list objects after sorting:  "+list);
    }
}
