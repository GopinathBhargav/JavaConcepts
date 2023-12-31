package telusko.learnings.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int eNo;
    String eName;
    @Override
    public String toString() {
        return "Employee{" +
                "eNo=" + eNo +
                ", eName='" + eName + '\'' +
                '}';
    }
    public Employee(int eNo, String eName) {
        this.eNo = eNo;
        this.eName = eName;
    }
}
public class TestStreamSort {
    public static void main(String[] args) {
        Comparator<Employee> emp = (i1,i2)-> i1.eName.compareTo(i2.eName);
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(20, "Java"));
        list.add(new Employee(30, "Java Script"));
        list.add(new Employee(10, "Python"));
        list.add(new Employee(90, "C++"));

        Collections.sort(list,emp);
        System.out.println(list); // [Employee{eNo=90, eName='C++'}, Employee{eNo=20, eName='Java'}, Employee{eNo=30, eName='Java Script'}, Employee{eNo=10, eName='Python'}]

        List<Employee> e = list.stream().sorted(emp).collect(Collectors.toList());
        System.out.println(e);// [Employee{eNo=90, eName='C++'}, Employee{eNo=20, eName='Java'}, Employee{eNo=30, eName='Java Script'}, Employee{eNo=10, eName='Python'}]

        List<Employee> li = list.stream().filter(i-> i.eNo>20).sorted(emp).collect(Collectors.toList());
        System.out.println(li);// [Employee{eNo=90, eName='C++'}, Employee{eNo=30, eName='Java Script'}]

    }
}
