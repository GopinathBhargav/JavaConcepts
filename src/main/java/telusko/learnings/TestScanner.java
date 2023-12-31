package telusko.learnings;

import java.util.Scanner;

class Guesser{
    private int guessNumber;
    public int getNumberFromConsole(){

        Scanner scan = new Scanner(System.in);
        guessNumber = scan.nextInt();
        System.out.println("value from guesser is : "+ guessNumber);
        return guessNumber;
    }
}

class Player{

    private int numberFromPlayer1;
    private int numberFromPlayer2;
    private int numberFromPlayer3;
    public int player1Guesses(){

        Scanner scan = new Scanner(System.in);
        numberFromPlayer1 = scan.nextInt();
        System.out.println("value from player 1 is : "+ numberFromPlayer1);
        return numberFromPlayer1;
    }

    public int player2Guesses(){

        Scanner scan = new Scanner(System.in);
        numberFromPlayer2 = scan.nextInt();
        System.out.println("value from player 2 is : "+ numberFromPlayer2);
        return numberFromPlayer2;
    }

    public int player3Guesses(){

        Scanner scan = new Scanner(System.in);
        numberFromPlayer3 = scan.nextInt();
        System.out.println("value from player 3 is : "+ numberFromPlayer3);
        return numberFromPlayer3;
    }

}

public class TestScanner {

    public static void main(String[] args) {

        Guesser g = new Guesser();
        int guessedNumber = g.getNumberFromConsole();
        Player p1 = new Player();
        int guessedNumberP1 = p1.player1Guesses();
        Player p2 = new Player();
        int guessedNumberP2 = p2.player2Guesses();
        Player p3 = new Player();
        int guessedNumberP3 = p3.player3Guesses();

        if(guessedNumber == guessedNumberP1 && guessedNumber == guessedNumberP2 && guessedNumber == guessedNumberP3) {
            System.out.println("All players win");
        }else if(guessedNumber == guessedNumberP1 && guessedNumber == guessedNumberP2){
            System.out.println("players 1 and 2 win");
        }else if(guessedNumber == guessedNumberP1 && guessedNumber == guessedNumberP3){
            System.out.println("players 1 and 3 win");
        }else if(guessedNumber == guessedNumberP2 && guessedNumber == guessedNumberP3){
            System.out.println("players 2 and 3 win");
        }else if(guessedNumber == guessedNumberP1){
            System.out.println("player 1 wins");
        }else if(guessedNumber == guessedNumberP2){
            System.out.println("player 2 wins");
        }else if(guessedNumber == guessedNumberP3){
            System.out.println("player 3 wins");
        }else{
            System.out.println("no one wins");
        }

    }
}
