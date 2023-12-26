package telusko.learnings.enums;

enum Week{

    MONDAY, TUESDAY, WEDNESDAY;

   Week(){
       System.out.println("enum constructor called");
   }

   int val;
    public void setValue(int val){
      this.val = val;
   }

   public int getValue(){
       return val;
   }
}
public class TestEnum {

    enum Month{
        JAN(10), FEB(20), MAR(30), APR(40);
        int i;

        Month(int i) {

            this.i = i;
            System.out.println("value of i is " + i);
        }
    }

    public static void main(String[] args) {

        enum Directions{

            EAST, WEST, NORTH, SOUTH;

        }

        System.out.println(Week.MONDAY);
        Week.MONDAY.setValue(29);
        System.out.println(Week.MONDAY.getValue());

        System.out.println(Week.TUESDAY.getValue());

        Directions[] dir = Directions.values();

        for(Directions d: dir){
            System.out.print( d.name() + " - " + d.ordinal() + "  ,  ");
        }

        System.out.println();


        for(Month m :Month.values()){
            System.out.println(m.i);
        }


    }
}
