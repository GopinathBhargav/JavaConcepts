package telusko.learnings.innerClass;


//Example 1 --- using normal class
class AnonymousInnerClassA{

    public void meth(){
        System.out.println("anonymous method");
    }
}
// instead of using child class we directly created anonymous class
//class AnonymousInnerClassB extends AnonymousInnerClassA{
//  @Override
//    public void meth(){
//        System.out.println("anonymous overridden method in child class");
//    }
//    public void specializedMeth(){
//        System.out.println("specialized method in child class");
//    }
//}
public class AnonymousInnerClass {

    public static void main(String[] args) {


       AnonymousInnerClassA anonymous = new AnonymousInnerClassA()
        {

           @Override
            public void meth(){
                System.out.println("anonymous overridden method in child class");
            }

            public void specializedMeth(){
                System.out.println("specialized method in child class");
            }
        };

        anonymous.meth();
        //anonymous.specializedMeth();
    }
}
