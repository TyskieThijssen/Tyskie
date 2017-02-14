package com.oose.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Thijs on 10-2-2017.
 */
public interface HelloInterface extends Remote {
    public String helloTo(String name) throws RemoteException;

    public String sayHello(String name) throws RemoteException;
}
