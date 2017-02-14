package oose.ooad.mastermind;

import java.util.Scanner;

/**
 * Created by Tyskie on 13-2-2017.
 */
public class MastermindConsole {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mastermind. Try to find the secret code.");

        ColorCombination secretCode = new ColorCombination("NSFW");
        MastermindGame game = new MastermindGame(1, false, secretCode);

        while (!game.isWon() ^ game.getTurn() > 8) {
            System.out.print("Turn " + game.getTurn() + "/8 guess please: ");
            game.checkCombination(scanner.next());
        }
    }
}
