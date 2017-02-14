package com.oose.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Thijs on 10-2-2017.
 */
public interface PersonInterface extends Remote {
    public Person retrieveInformation(String name) throws RemoteException;
}
