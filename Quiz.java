/**
 * Created by kchaw on 4/14/2017.
 */

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    char ch;
    int i, correctAns = 0;
    int noOfQues = 5;
    ArrayList QuizQues = new ArrayList();
    ArrayList QuizOptions = new ArrayList();
    ArrayList QuizAns = new ArrayList();

    // Method for storing the Questions, Options and Answers in the ArrayLists declared above.
    public void QuizQA() {

        QuizQues.add("Name the capital of The United States of America.");
        QuizQues.add("Which is the tallest mountain in the world?");
        QuizQues.add("Where is Portland State University situated?");
        QuizQues.add("Who made the first microprocessor?");
        QuizQues.add("When is the Independence Day celebrated in the USA?");

        QuizOptions.add("a) New York \nb) California \nc) Washington DC \nd) Portland");
        QuizOptions.add("a) Mt Hood \nb) Mt Everest \nc) Mt Fuji \nd) Mt Kilimanjaro");
        QuizOptions.add("a) Mumbai \nb) Portland \nc) Paris \nd) Geneva");
        QuizOptions.add("a) Intel \nb) AMD \nc) Texas Instruments \nd) NVIDIA");
        QuizOptions.add("a) 26th January \nb) 15th August \nc) 4th July \nd) 9th April");

        QuizAns.add("c");
        QuizAns.add("b");
        QuizAns.add("b");
        QuizAns.add("a");
        QuizAns.add("c");

    }

    // User interface method for playing the Quiz
    public void letsPlayQuiz() {
        System.out.print("\nLet's play Quiz!!");
        try {
            Scanner scanner = new Scanner(System.in);
            String temp = null;
            for(i=0;i<noOfQues;i++){
                System.out.print("\n\nQuestion " + (i+1) + ": " + QuizQues.get(i) + "\nOptions:\n" + QuizOptions.get(i));
                System.out.print("\nPlease enter a valid option (A/B/C/D): ");
                ch = scanner.next().charAt(0);
                 // The user will remain in the following While loop until he/she provides a valid option as answer
                while (!(ch == 'A' || ch == 'a' || ch == 'B' || ch == 'b' || ch == 'C' || ch == 'c' || ch == 'D' || ch == 'd')){
                    System.out.print("\nInvalid option.\nPlease enter a valid option (A/B/C/D): ");
                    ch = scanner.next().charAt(0);
                }
                    temp = Character.toString(ch);
                    if(temp.equalsIgnoreCase(String.valueOf(QuizAns.get(i)))) {
                    System.out.println("\nCorrect Answer!!");
                    correctAns++;
                }
                else {
                    System.out.println("\nIncorrect Answer!!");
                }
                System.out.println("Answer: "+ QuizAns.get(i));
                    // Character ch is initialised to invalid character to clear the present valid character
                    // This is to facilitate the proper functioning of while loop
                ch = 'X';
              }

        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Error\n" + e.getMessage());
            System.exit(0);
        }

    }

    // Method for printing the final result of the Quiz
    public void QuizResult(){
        System.out.println("\nFinal Result:");
        System.out.println("\nYou answered " + noOfQues +" questions out of which:\nCorrect Answers : " + correctAns + "\nIncorrect Answers : " + (5-correctAns));
        int QuizStats;
        QuizStats = (correctAns * 100) / noOfQues;
        System.out.println("Quiz Statistics: " + QuizStats + "%");
        System.out.println("\nThank you for playing this Quiz... Have a nice day!!");
    }
}