package oose.ooad.mastermind;

import java.util.Scanner;

/**
 * Created by Tyskie on 13-2-2017.
 */
public class MastermindConsole {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mastermind. Try to find the secret code.");

        ColorCombination secretCode = new ColorCombination("BBWR");
        MastermindGame game = new MastermindGame(0, false, secretCode);

        while (!game.isWon() ^ game.getTurn() >= 8) {
            System.out.print("Guess please: ");
            game.checkCombination(scanner.next());
        }
    }
}
