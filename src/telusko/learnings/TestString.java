package telusko.learnings;

public class TestString {

    public static void main(String[] args) {

        String s1= "Telusko";
        String s2 = "telusko";
        int n = s1.compareTo(s2);
        System.out.println("value of n is " + n); // here value of n is 32 based on ascii

        String value = (n==0)? "strings are equal" : "strings are not equal";
        System.out.println(value);

        // String concatenation
        String name = "Gopi";
        System.out.println(name); // Gopi
        name.concat("nath");
        System.out.println(name); // Gopi  even here, it is Gopi as string is immutable

        // suppose if we store result in another name then the output will be Gopinath
        // as we are storing in anew string object which will be stored in string constant pool
        String name2 = name.concat("nath");
        System.out.println(name2); // Gopinath

        String nameA = new String("Gopi");
        String nameB = new String("Gopi");
        String values = (n==0)? "strings are equal" : "strings are not equal";
        System.out.println(values);

        String sn = "gopi";
        String sni = "vura" + sn.concat("nath") ;

        System.out.println(sni);


        final StringBuffer sb = new StringBuffer("Gopinath");
       sb.append("bhargav");

        System.out.println(sb);

        StringBuffer buffers = new StringBuffer();
        System.out.println("capacity is " + buffers.capacity()); // default capacity is 16
        buffers.append("Gopinath Bhargav");
        System.out.println("append capacity is " + buffers.capacity()); // here default capacity is 16 and we have appended Gopinath Bhargav whihc is of length 16, so it will be accomodated in 16
        // suppose if length exceeds even a single character of 16 the new length calculation in string builder and buffer is (current length * 2) + 2
        // i.e., if it exceeds 16 the it is 16*2 + 2 == 34, if it exceeds 34 then it is 34*2 + 2 = 70
        StringBuffer buffer = new StringBuffer("Gopinath");
        System.out.println("capacity is " + buffer.capacity()); // here default capacity of string buffer and string builder is 16 as we have already given gopinath in constructor it will add 16 + Gopinath length whhich is 16 + 8 i.e., 24


        StringBuffer sb1 = new StringBuffer("Gopi");
        StringBuffer sb2 = new StringBuffer("Gopi");
        System.out.println(sb1.equals(sb2));

    }
}
