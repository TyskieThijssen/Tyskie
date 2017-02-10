package com.oose.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Thijs on 10-2-2017.
 */
public interface WeatherInterface extends Remote {
    public Weather retrieveWeather(String city) throws RemoteException;
}
