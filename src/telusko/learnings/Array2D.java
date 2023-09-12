package telusko.learnings;

public class Array2D {

    public static void main(String[] args) {

        int arr[][]= new int[2][3];


       // System.out.println(arr.length);

        for(int i=0; i< arr.length; i++){

           // System.out.println(arr[i].length);

            for(int j=0; j< arr[i].length; j++){

                    arr[i][j] = (int)(Math.random()*10);
                    System.out.print(arr[i][j] + " ");

            }

            System.out.println();
        }
    }
}
