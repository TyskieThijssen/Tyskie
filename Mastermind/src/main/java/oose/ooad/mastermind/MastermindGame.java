package oose.ooad.mastermind;

/**
 * Created by Tyskie on 13-2-2017.
 */
public class MastermindGame {
    private int turn;
    private boolean won;
    private ColorCombination secretCode;

    public MastermindGame(int turn, boolean won, ColorCombination secretCode){
        this.turn = turn;
        this.won = won;
        this.secretCode = secretCode;
    }

    public void checkCombination(String guessAsString){
        ColorCombination guess = new ColorCombination(guessAsString);
        Hint hint = secretCode.copareWith(guess);
        System.out.println("Right colour right position = " + hint.getCorrect()
                            + "\nRight colour wrong position = " + hint.getSemiCorrect());
        if(hint.getCorrect() == 4){
            System.out.println("You've found the secret code. Congrats!");
            this.won = true;
        }
        if(turn > 8){
            System.out.println("You've lost the game!");
        }
    }

    public boolean isWon() {
        return won;
    }

    public int getTurn() {
        return turn;
    }
}
