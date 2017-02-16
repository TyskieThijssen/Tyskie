package oose.dea;

/**
 * Created by Tyskie on 16-2-2017.
 */
public class MaxValue {
    private int maxValue;
    private int valueLeft;

    public MaxValue(int maxValue){
        this.maxValue = maxValue;
        this.valueLeft = maxValue;
    }

    public int getMaxValue(){
        return maxValue;
    }

    public int getValueLeft() {
        return valueLeft;
    }

    public synchronized void increment() {
        valueLeft --;
    }
}
