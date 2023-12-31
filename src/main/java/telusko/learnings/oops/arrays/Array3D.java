package telusko.learnings.oops.arrays;

public class Array3D {

    public static void main(String[] args) {

//        int arr[][][]= new int[2][][];
//        arr[0][0] = new int[3];
//        arr[0][1] = new int[4];
//        arr[1][0] = new int[5];
//        arr[1][1] = new int[1];
//        arr[2][0] = new int[4];
//        arr[2][1] = new int[6];

        int arr[][][]= new int[2][6][19];


        for(int i=0; i< arr.length; i++){

            for(int j=0; j< arr[i].length; j++){

                for(int k=0; k<  arr[i][j].length;k++){

                    arr[i][j][k] = (int)(Math.random()*10);
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }


    }
}
