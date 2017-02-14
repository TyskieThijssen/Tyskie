package oose.ooad.mastermind;

import java.util.ArrayList;

/**
 * Created by Tyskie on 13-2-2017.
 */
public class ColorCombination {
    ArrayList<Peg> pegs = new ArrayList<Peg>(4);

    public ColorCombination(String guessAsString){
        char[] pegColors = guessAsString.toCharArray();
        for (char color : pegColors) {
            Peg peg = new Peg(color);
            pegs.add(peg);
        }
    }

    public Hint compareWith(ColorCombination other){
        int correct = determineRightColorRightPosition(other);
        int semiCorrect = determineRigthColorWrongPosition(other);

        Hint hint = new Hint(correct, semiCorrect);
        return hint;
    }

    public int determineRightColorRightPosition(ColorCombination other){
        int correct = 0;
        for(int i = 0; i < pegs.size(); i++){
            if(this.pegs.get(i).getColor() == other.pegs.get(i).getColor()){
                correct++;
            }
        }
        return correct;
    }

    public int determineRigthColorWrongPosition(ColorCombination other){
        int semiCorrect = 0;
        for(int i = 0; i < pegs.size(); i++){
            for(int j = 0; j < pegs.size(); j ++){
                if((this.pegs.get(i).getColor() == other.pegs.get(j).getColor()) && (this.pegs.get(i).getColor() != other.pegs.get(i).getColor())){
                    semiCorrect++;
                }
            }
        }
        return semiCorrect;
    }
}
