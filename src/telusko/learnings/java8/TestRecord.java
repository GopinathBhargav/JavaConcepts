package telusko.learnings.java8;

import java.util.Objects;

class RecordDemo{
    int number; String name;
    @Override
    public String toString() {
        return "RecordDemo{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
    public int getNumber() { return number;}
    public void setNumber(int number) {this.number = number;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public RecordDemo(int number, String name) {
        this.number = number;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordDemo that = (RecordDemo) o;
        return number == that.number && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}


record MyRecord(int number, String name) {
}
public class TestRecord {

    public static void main(String[] args) {
        RecordDemo dm = new RecordDemo(2,"java");
        RecordDemo dm1 = new RecordDemo(2,"java");

//        String s1 = "Gopi";
//        String s2= "Gopi";
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);

        System.out.println(dm.equals(dm1));
        System.out.println(dm==dm1);

        MyRecord rec = new MyRecord(2,"java");
        MyRecord rec1 = new MyRecord(2,"java");

        System.out.println(rec.equals(rec1));
        System.out.println(rec==rec1);
        
    }
}
