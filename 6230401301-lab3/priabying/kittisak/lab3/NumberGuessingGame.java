/**
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

public class NumberGuessingGame {
    public static void main(String[] args) {

        // welcome program.
        System.out.println("Welcome to a number guessing game!");

        // scanner
        Scanner in = new Scanner(System.in);

        // random
        int max = 10;
        int min = 1;
        int ran = min + (int) (Math.random() * ((max - min) + 1)); // [1,10]

        boolean correct = false;
        int i = 0;
        while (true) {
            System.out.printf("Enter an integer between %d and %d:", min, max);
            int num = in.nextInt();
            correct = (num == ran);

            if (num > 10 || num < 1) {
                System.out.printf("Please enter an integer between %d and %d \n", min, max);
                continue;
            } else if (!correct) {
                if (num > ran) {
                    System.out.println("Try a lower number!");
                } else if (num < ran) {
                    System.out.println("Try a higher a number!");
                }
            }
            i++;
            if (correct || i == 5)
                break;

        }
        if (correct) {
            System.out.println("Congratulations!");
            System.out.println("You have tried " + i + " times.");
        } else {
            System.out.println("You have tried " + i + " times. You ran out of guesses");
            System.out.println("The answer is " + ran);
        }
        in.close();
    }

}
