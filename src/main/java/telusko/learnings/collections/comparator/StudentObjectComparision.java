package telusko.learnings.collections.comparator;

import java.util.Comparator;

public class StudentObjectComparision implements Comparator<StudentDetails> {

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {

        if(o1.getAge() > o2.getAge())
            return 1;
            else
                return -1;

    }
}
