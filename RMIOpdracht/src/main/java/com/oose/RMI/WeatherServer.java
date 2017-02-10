package com.oose.RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by Thijs on 10-2-2017.
 */
public class WeatherServer {
    public static void main(String[] args){
        try{
            LocateRegistry.createRegistry(1099);
            Naming.rebind("WeatherServer", new WeatherImpl());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e){
            e.printStackTrace();
        }
    }
}