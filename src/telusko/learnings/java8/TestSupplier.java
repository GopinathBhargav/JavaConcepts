package telusko.learnings.java8;

import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {

        Supplier<String> sup = () ->{
            String OTP ="";
            for( int i=0; i<6; i++){

                OTP = OTP + (int) (Math.random()*10);
            }
            return OTP;
        };

        System.out.println(sup.get());
    }
}
