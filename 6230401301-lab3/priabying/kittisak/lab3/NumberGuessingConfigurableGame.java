/**
* 
* Use method .
* Program called NumberGuessingGame that simulates a guessing game of which a user guesses number from 1 to 10.
* The answer is randomly generated then a user enter a number via the console.
* outputs displayed "Congratulations!" : if a number entered is the same as the answer.
* outputs displayed "Try a lower number!" : if the number entered is higher than the answer.
* outputs displayed "Try a higher number!" : if the number entered is smaller than the answer.
* The game ends when user guess the answer correctly or the user guess the number incorrectly five times.
*
*
* Author: kittisak Priabying.
* ID: 623040123-4
* Sec: 1
* Date: December 20, 2019
*
**/
package priabying.kittisak.lab3;
import java.util.Scanner;
public class NumberGuessingConfigurableGame {
    static int answer, min, max, numTries;
    public static void main(String[] args) {
        configure();
        answer = genAnswer();
        playGame();
    }

    // cofigure
    private static void configure() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the min value: ");
        int num1 = input.nextInt();

        System.out.print("Enter the max value: ");
        int num2 = input.nextInt();
        System.out.print("Enter the maximum number of tries: ");
        int num3 = input.nextInt();

        min = num1;
        max = num2;
        numTries = num3;

    }

    // random
    private static int genAnswer() {
        int ran = min + (int) (Math.random() * ((max - min) + 1)); // [1:10]
        return ran;
    }

    private static void playGame() {
        Scanner in = new Scanner(System.in);
        boolean correct = false;
        int i = 0;

        // welcome program.
        System.out.println("Welcome to a number guessing game!");

        // play game
        while (true) {
            System.out.printf("Enter an integer between %d and %d:", min, max);
            int num = in.nextInt();
            correct = (num == answer);

            if (num > max || num < min) {
                System.out.printf("Please enter an integer between %d and %d \n", min, max);
                continue;

            } else if (!correct) {
                if (num > answer) {
                    System.out.println("Try a lower number!");  
                } else if (num < answer) {
                    System.out.println("Try a higher a number!");
                }
            }
            i++;
            if (correct || i == numTries)
                break;

        }
        if (correct) {
            System.out.println("Congratulations!");
            System.out.println("You have tried " + i + " times.");
            System.out.print("Want to play again (Y or y):");

            Scanner userInput = new Scanner(System.in);
            String againt = userInput.nextLine();
            if (againt.equals("y") || againt.equals("Y")) {  // y or Y play game again.
                playGame();
            } else {
                System.out.println("Thank you for playing our game. Bye! ");
            }
            userInput.close();
        } else {
            System.out.println("You have tried " + i + " times. You ran out of guesses");
            System.out.println("The answer is " + answer);
            System.out.print("Want to play again (Y or y):");

            Scanner userInput = new Scanner(System.in);
            String againt = userInput.nextLine();
            if (againt.equals("y") || againt.equals("Y")) {   // y or Y play game again.
                playGame();
            } else {
                System.out.println("Thank you for playing our game. Bye! ");
            }
            userInput.close();
        }
        in.close();
    }
}
