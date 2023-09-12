package telusko.learnings;

import java.util.Scanner;

class InvalidCustomer extends Throwable {

    public InvalidCustomer(String msg) {
        super(msg);
    }
}


class ATM {

    int accountNo = 1234;
    int pinNo = 1234;
    int acc, pin;
    Scanner sc = new Scanner(System.in);

    public int inputAccNo() {

        System.out.println("please enter your account num ");
        acc = sc.nextInt();
        return acc;
    }

    public int inputPin() {

        System.out.println("please enter your account pin ");
        pin = sc.nextInt();
        return pin;
    }

    public void verifyDetails() throws InvalidCustomer {


        int accN = inputAccNo();
        int accPin = inputPin();
        if ((accountNo == accN) && (pinNo == accPin)) {
            System.out.println("You have successfully logged in");
        } else {
            InvalidCustomer ic = new InvalidCustomer("you have entered invalid details");
            System.out.println(ic.getMessage());
            throw ic;
        }

    }
}

class Bank {

    public void checkMaxAttempts() {
        ATM atm = new ATM();
        try {
            atm.verifyDetails();
        } catch (Exception | InvalidCustomer e) {
            try {
                atm.verifyDetails();
            } catch (Exception | InvalidCustomer ex) {
                try {
                    atm.verifyDetails();
                } catch (Exception | InvalidCustomer exc) {
                    System.out.println("Your card is Blocked");
                }
            }
        }
    }
}

public class CustomExceptions {

    public static void main(String[] args) {
        Bank b = new Bank();
        b.checkMaxAttempts();
    }

}
