package telusko.learnings.oops.arrays;

import java.util.Arrays;

public class TestJaggedArray2D {

    public static void main(String[] args) {

        int[][] a = new int[2][];
        a[0] = new int[3];
        a[1] = new int[4];

        a[0][0] = 1;
        a[0][1] = 40;
        a[0][2] = 24;

        a[1][0] = 26;
        a[1][1] = 41;
        a[1][2] = 12;
        a[1][3] = 9;

        for(int[] n : a){
            System.out.println(Arrays.toString(n));
        }

    }

}
