package oose.dea;

/**
 * Created by Tyskie on 14-2-2017.
 */
public class Vial {
    private final int maxCapacity;
    private int capacityLeft;

    public Vial(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.capacityLeft = maxCapacity;
    }

    public int fill(int capacity){
        if(capacity > capacityLeft){
            capacity = capacityLeft;
        }
        capacityLeft -= capacity;
        return capacity;
    }

    public int getCapacityLeft() {
        return capacityLeft;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
