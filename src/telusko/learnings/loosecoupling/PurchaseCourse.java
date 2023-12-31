package telusko.learnings.loosecoupling;

public class PurchaseCourse {

    private MainCourse course;

    // dependency injection - here we are passing reference from different class within constructor -- this is constructor injection
    // Here PurchaseCourse is dependent on some class to give object reference to this, and JavCourse class etc are injecting data
    // to this, this is called dependency injection
    public PurchaseCourse(MainCourse course){

        this.course = course;

    }

    public boolean buyCourse(int amount){

        return course.coursePurchase();
    }

}
