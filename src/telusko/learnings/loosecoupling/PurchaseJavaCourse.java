package telusko.learnings.loosecoupling;

public class PurchaseJavaCourse implements MainCourse {
    @Override
    public boolean coursePurchase() {
        System.out.println("java course purchased");
        return true;
    }
}
