package com.oose.RMI;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Thijs on 10-2-2017.
 */
public class WeatherImpl extends UnicastRemoteObject implements WeatherInterface, Serializable {
    public WeatherImpl() throws RemoteException {
    }

    public Weather retrieveWeather(String city) throws RemoteException {
        Weather taipei = new Weather();
        taipei.setTemperature(26);
        return taipei;
    }
}
