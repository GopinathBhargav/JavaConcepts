package telusko.learnings.oops.arrays;

public class ArraySingleDimension {

    public static void main(String[] args) {

        int a[] = new int[4];

        for( int i=0; i< a.length; i++){

            int number = (int)(Math.random()*10);
            a[i]= number;
        }

        for( int i=0; i< a.length; i++){
            System.out.print( a[i] + " ");
        }
    }
}
