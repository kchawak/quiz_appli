/**
 * Created by kchaw on 4/14/2017.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Hi! This is a Multiple Choice Quiz program");
        System.out.println("\n\n Rules: \n 1. You will be asked a number of questions \n 2. You need to enter a valid option \n 3. At the end of the quiz, the statistics will be displayed \n 4. No cheating!! ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nReady to play? Please answer Y/N: ");
        char choiceToPlay = scanner.next().charAt(0);           // Taking only the first character of the input from user
        if (choiceToPlay == 'Y' || choiceToPlay == 'y') {
            Quiz obj = new Quiz();                              // Creating a new Quiz object and calling the relevant methods sequentially
            obj.QuizQA();
            obj.letsPlayQuiz();
            obj.QuizResult();
        }
        else if (choiceToPlay == 'N' || choiceToPlay == 'n'){
            System.out.print("Quitting the application. \n Have a nice day!!");
        }
        else {
            System.out.print("Invalid Choice... Quitting the application. \n Have a nice day!!");
        }
    }
}