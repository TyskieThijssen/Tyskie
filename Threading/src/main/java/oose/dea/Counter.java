package oose.dea;

/**
 * Created by Tyskie on 16-2-2017.
 */
public class Counter implements Runnable{
    private String name;
    private MaxValue maxValue;

    private int incremented = 0;

    public Counter(String name, MaxValue maxValue){
        super();
        this.name = name;
        this.maxValue = maxValue;
    }

    public void increment(){
        maxValue.increment();
        incremented++;
        System.out.println(this.name + " incremented the counter");
    }

    public void run(){
        while(maxValue.getValueLeft() > 0){
            increment();
            try{
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Counter " + this.name + " incremented " + incremented);
    }
}
