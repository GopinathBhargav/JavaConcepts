package telusko.learnings.loosecoupling;

public class PurchaseJavaScriptCourse implements MainCourse {
    @Override
    public boolean coursePurchase() {
        System.out.println("java script course purchased");
        return false;
    }
}
