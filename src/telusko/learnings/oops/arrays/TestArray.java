package telusko.learnings.oops.arrays;

public class TestArray {

    public static void main(String[] args) {

        int a[] = new int[5];

        a[0] = 10;
        a[4] = 9;

        for(int n : a){
            System.out.println(n);
        }

    }
}
