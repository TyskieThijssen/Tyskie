package com.oose.RMI;

import java.io.Serializable;

/**
 * Created by Thijs on 10-2-2017.
 */
public class Weather implements Serializable {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
