package telusko.learnings;

import java.util.Scanner;

public class TestMultiDimensionArray {

    public static void main(String[] args) {

        int arr[][] = new int[2][3];
        Scanner sc= new Scanner(System.in);
        //int number = sc.nextInt();

        for(int i =0; i< arr.length; i++){

            for(int j=0; j< arr[i].length; j++){
                System.out.println("please enter value at position " + i + " " + j + "is :");
                arr[i][j]= sc.nextInt();
            }
        }

        for(int i =0; i< arr.length; i++){

            for(int j=0; j< arr[i].length; j++){

                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
