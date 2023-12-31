package telusko.learnings.loosecoupling;

public class PurchasePythonCourse implements MainCourse {
    @Override
    public boolean coursePurchase() {
        System.out.println("Python course purchased");
        return false;
    }
}
