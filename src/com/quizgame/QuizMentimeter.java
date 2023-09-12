package com.quizgame;

import java.util.Scanner;

public class QuizMentimeter {

    public static void main(String[] args) {


        Questions[] totalQuestions = new Questions[5];

        Questions question_1 = new Questions("size of int data type", "2", "4", "6", "8", "4");
        Questions question_2 = new Questions("size of float data type", "2", "4", "6", "8", "4");
        Questions question_3 = new Questions("size of double data type", "2", "4", "6", "8" , "8");
        Questions question_4 = new Questions("size of char data type", "2", "4", "6", "8", "2");
        Questions question_5 = new Questions("size of byte data type", "1", "4", "6", "8", "1");

        totalQuestions[0] = question_1;
        totalQuestions[1] = question_2;
        totalQuestions[2] = question_3;
        totalQuestions[3] = question_4;
        totalQuestions[4] = question_5;

         QuizMethodServices services = new QuizMethodServices();
         int participantScore = services.displayQuestion(totalQuestions);
         System.out.println("Score of the participant is " + participantScore);


    }
}
