package telusko.learnings.oops.arrays;

import java.util.Arrays;

public class Testjagged3DArray {

    public static void main(String[] args) {

        int[][][] a = new int[2][3][];

        // Index 0 array
        a[0][0] = new int[1];
        a[0][1] = new int[4];
        a[0][2] = new int[2];
        // Index 1 array
        a[1][0] = new int[3];
        a[1][1] = new int[4];
        a[1][2] = new int[3];

        // First matrix
        a[0][0][0] = 12;

        a[0][1][0] = 12;
        a[0][1][1] = 11;
        a[0][1][2] = 16;
        a[0][1][3] = 17;

        a[0][2][0] = 7;
        a[0][2][1] = 88;

        // second matrix
        a[1][0][0] = 1;
        a[1][0][1] = 15;
        a[1][0][2] = 11;

        a[1][1][0] = 12;
        a[1][1][1] = 11;
        a[1][1][2] = 16;
        a[1][1][3] = 17;

        a[1][2][0] = 7;
        a[1][2][1] = 88;
        a[1][2][2] = 11;


        for(int[][] n: a){

            for(int[] nos : n){
                System.out.println(Arrays.toString(nos));
            }
            System.out.println();

        }

    }
}
