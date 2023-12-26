package telusko.learnings.enums;

enum Fruits{

    Apple(20), Banana(30);

    int val;
    Fruits(int val) {
        this.val = val;
    }
}

public class NewTestEnum {


    public static void main(String[] args) {

        Fruits[] f=Fruits.values();
        for(Fruits fr : f){
            System.out.println(fr.val);
        }
    }
}
