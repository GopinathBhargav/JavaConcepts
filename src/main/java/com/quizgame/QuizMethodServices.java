package com.quizgame;

import java.util.Scanner;

public class QuizMethodServices {

    public int displayQuestion(Questions[] totalQuestions){

        int totalScore = 0;
        for (int i =0; i< totalQuestions.length; i++) {

            System.out.println("Question "+ (i +1) +" : " +totalQuestions[i].getQuestion());
            System.out.println(totalQuestions[i].getOption_1());
            System.out.println(totalQuestions[i].getOption_2());
            System.out.println(totalQuestions[i].getOption_3());
            System.out.println(totalQuestions[i].getOption_4());

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your option out of the options displayed");
            String enterAnswer = scan.nextLine();
            System.out.println("The answer that user entered is " + enterAnswer);


            if(totalQuestions[i].getAnswer().equals(enterAnswer)){
                totalScore ++;
            }else {
                totalScore = (totalScore <= 0) ? 0 : totalScore--;
            }

            System.out.println("total score of user is " + totalScore);
            System.out.println();
        }

        return totalScore;

    }
}


//    public int displayQuestion(Questions[] totalQuestions) {
//
//
//        totalScore = 0;
//        int maxQuestionsPerAttempt = 5;
//        for (int i = 0; i < maxQuestionsPerAttempt; i++) {
//
//            int randomArrayIndex = (int) (Math.random() * totalQuestions.length);
//            System.out.println("random array index is " + randomArrayIndex);
//
//            System.out.println("Question " + (i + 1) + " : " + totalQuestions[randomArrayIndex].getQuestion());
//            System.out.println(totalQuestions[randomArrayIndex].getOption_1());
//            System.out.println(totalQuestions[randomArrayIndex].getOption_2());
//            System.out.println(totalQuestions[randomArrayIndex].getOption_3());
//            System.out.println(totalQuestions[randomArrayIndex].getOption_4());
//
//            // Make sure that random value should not match within the 5 questions
//            // Store previous random value indexes in an array and check
//
//            scan = new Scanner(System.in);
//            System.out.println("Enter your option out of the options displayed");
//            String enterAnswer = scan.nextLine();
//            System.out.println("The answer that user entered is " + enterAnswer);
//
//
//            if (totalQuestions[randomArrayIndex].getAnswer().equals(enterAnswer)) {
//                totalScore++;
//            } else {
//                totalScore = (totalScore <= 0) ? 0 : --totalScore;
//            }
//
//            System.out.println("TOTAL SCORE OF USER IS " + totalScore);
//            //System.out.println("PLEASE ENTER IF YOU WANT TO RETRY THE QUIZ");
//            System.out.println();
//
//        }
//        return totalScore;
//
//    }

