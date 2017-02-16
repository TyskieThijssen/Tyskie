package oose.dea;

import java.util.ArrayList;

/**
 * Created by Tyskie on 16-2-2017.
 */
public class Main {
    private static final int nThreads = 10;
    private static final int maxValue = 1000;

    public static void main(String[] args){
        MaxValue max = new MaxValue(maxValue);

        ArrayList<Counter> counters = new ArrayList<Counter>();

        for(int i = 1; i <= nThreads; i++){
            counters.add(new Counter(""+ i + "", max));
        }

        for (Counter counter:counters) {
            new Thread(counter).start();
        }
    }
}
