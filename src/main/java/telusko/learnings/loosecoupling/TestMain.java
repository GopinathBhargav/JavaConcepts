package telusko.learnings.loosecoupling;

public class TestMain {

    public static void main(String[] args) {

        PurchaseJavaCourse jc = new PurchaseJavaCourse();
        PurchasePythonCourse ppc = new PurchasePythonCourse();
        PurchaseJavaScriptCourse jsc = new PurchaseJavaScriptCourse();
        PurchaseCourse pc = new PurchaseCourse(jsc); // Here we are injecting the object reference of java class to PurchaseCourse class
        pc.buyCourse(1000);

    }
}
