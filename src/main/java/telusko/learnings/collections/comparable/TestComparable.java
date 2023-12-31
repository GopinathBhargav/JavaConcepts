package telusko.learnings.collections.comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparable {

    public static void main(String[] args) {

        EmployeeDetails emp1 = new EmployeeDetails("gopi");
        EmployeeDetails emp2 = new EmployeeDetails("Bhargav", 3);
        EmployeeDetails emp3 = new EmployeeDetails("zeroDegree", 2, 2);

        ArrayList list = new ArrayList();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
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
//        Comparator<EmployeeDetails> comparision = (EmployeeDetails o1, EmployeeDetails o2) ->{
//
//            if (o1.getAge() > o2.getAge()) {
//                return 1;
//            } else if (o1.getAge() < o2.getAge()) {
//                return -1;
//            } else {
//                return 0;
//            }
//
//        };

        Collections.sort(list);
        System.out.println("Array list objects after sorting:  "+list);
    }
}
