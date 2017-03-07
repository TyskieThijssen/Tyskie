package oose.dea;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by tyskie on 3/3/17.
 */
public class GuessTheNumber {
    private static boolean won = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;

        while(won == false) {
            System.out.print("Select a number between 1-10: ");
            int userInput = scanner.nextInt();

            System.out.println(checkIfCorrect(numberToGuess, userInput));
        }
    }

    public static String checkIfCorrect(int numberToGuess, int userInput) {
        if(userInput > numberToGuess){
            return "Wrong number, it's too high!";
        } else if(userInput < numberToGuess){
            return "Wrong number, it's too low!";
        }
        won = true;
        return "You've guessed the right number!";
    }
}
