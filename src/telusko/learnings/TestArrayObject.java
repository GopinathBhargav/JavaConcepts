package telusko.learnings;

import java.util.Arrays;

public class TestArrayObject {
    Object obj[] = new Object[5];

    public void createArrayData(){
        obj[0] = "gopi";
        obj[1] = 1;
        obj[2] = 'c';
        obj[3]= 12.22;
        obj[4]= 12.2f;

        for(int i=0; i< obj.length; i++){

            System.out.println(obj[i]);
        }

        System.out.println(Arrays.toString(obj));
    }

    public static void main(String[] args) {


        TestArrayObject t = new TestArrayObject();
          t.createArrayData();

    }
}
