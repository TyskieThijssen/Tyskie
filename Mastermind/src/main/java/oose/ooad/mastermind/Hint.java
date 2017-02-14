package oose.ooad.mastermind;

/**
 * Created by Tyskie on 13-2-2017.
 */
public class Hint {
    private int correct;
    private int semiCorrect;

    public Hint(int correct, int semiCorrect){
        this.correct = correct;
        this.semiCorrect = semiCorrect;
    }

    public int getCorrect() {
        return correct;
    }

    public int getSemiCorrect() {
        return semiCorrect;
    }
}
