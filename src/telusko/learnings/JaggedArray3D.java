package telusko.learnings;

public class JaggedArray3D {

    public static void main(String[] args) {

        System.out.println(" Example 1 - JAGGED ARRAY");
        System.out.println();
        // jagged array example 1
        int ar[][][]= new int[2][3][];
        ar[0][0] = new int[3];
        ar[0][1] = new int[4];
        ar[0][2] = new int[5];
        ar[1][0] = new int[5];
        ar[1][1] = new int[2];
        ar[1][2] = new int[4];

        for(int i=0; i< ar.length; i++){

            for(int j=0; j< ar[i].length; j++){

                for(int k=0; k<  ar[i][j].length;k++){

                    ar[i][j][k] = (int)(Math.random()*10);
                    System.out.print(ar[i][j][k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }


        System.out.println(" Example 2 - JAGGED ARRAY");
        System.out.println();

        // EXAMPLE 2

        int arr[][][]= new int[2][][];

        arr[0] = new int[2][4];
        arr[1] = new int[1][5];

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


        System.out.println(" Example 3 - JAGGED ARRAY");
        System.out.println();
        // example 3

        int array[][][]= new int[2][][];

        array[0] = new int[2][];
        array[1] = new int[1][];

        array[0][0] = new int[3];
        array[0][1] = new int[4];

        array[1][0] = new int[5];


        for(int i=0; i< array.length; i++){

            for(int j=0; j< array[i].length; j++){

                for(int k=0; k<  array[i][j].length;k++){

                    array[i][j][k] = (int)(Math.random()*10);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

    }
}
