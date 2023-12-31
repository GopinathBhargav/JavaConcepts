package telusko.learnings.oops.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrayToString {
    public static void main(String[] args) {

        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< a.length; i++) {
            a[i] = sc.nextInt();
        }

        for(int n : a) {
            System.out.println(n);
        }

        System.out.println(Arrays.toString(a));
    }
}
