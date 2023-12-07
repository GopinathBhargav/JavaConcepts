package telusko.learnings.oops.arrays;

import java.util.Arrays;

public class TestArray2D {

    public static void main(String[] args) {

        int a[][] = new int[2][3];

        a[0][0] = 2;
        a[0][1] = 21;
        a[0][2] = 23;

        a[1][0] = 4;
        a[1][1] = 31;
        a[1][2] = 3;

        for(int rows=0; rows< a.length; rows++){

            for(int cols=0; cols< a[rows].length; cols++){

                System.out.print(a[rows][cols] + " ");

            }
            System.out.println();
        }


        for(int rows=0; rows< a.length; rows++){
            System.out.println( Arrays.toString(a[rows]));

        }


    }
}
