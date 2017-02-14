package com.oose.RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Thijs on 10-2-2017.
 */
public class WeatherClient {
    public static void main(String[] args){
        String rmiUrl = "rmi://localhost/WeatherServer";
        try {
            WeatherInterface weatherInterface = (WeatherInterface) Naming.lookup(rmiUrl);
            Weather vo = weatherInterface.retrieveWeather("taipei");
            System.out.println(vo.getTemperature());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
