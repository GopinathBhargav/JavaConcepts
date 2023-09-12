package telusko.learnings;

public class PatternProgram {

    public static void main(String[] args) {

        int n = 15;

        for(int i =0; i< n; i++){

//            for(int j=0; j< n; j++) {
//
//                String s = (i == 0 || i == 4) ? "*" : ((j > 0 && j < 4)? " " : "*");
//                System.out.print(s);
//            }

            for(int j=0;j<n;j++)
            {
                if(j==0 || j==(n-1)/2 && i!=0 && i!=(n-1)/2 && i!=n-1  ||
                        i==0 && j<(n-1)/2 ||
                        i==(n-1)/2 && j<(n-1)/2 ||
                        i==n-1 && j<(n-1)/2)
                {
                    System.out.print("*");

                }
                else
                {
                    System.out.print(" ");
                }

            }

            System.out.print("  ");

            for (int j = 0; j < n; j++) {

                if (j==0 || j== (n-1)/2 && i!=0 && i!= (n-1)/2 && i!= n-1 || i==0 && j<(n - 1)/2 || i==(n - 1)/ 2 && j<(n - 1)/2 || i==n-1 && j<(n - 1)/2)
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("");

            System.out.println();
        }
    }
}
