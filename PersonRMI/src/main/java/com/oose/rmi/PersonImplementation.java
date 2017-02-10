package com.oose.rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Thijs on 10-2-2017.
 */
public class PersonImplementation extends UnicastRemoteObject implements PersonInterface, Serializable {
    public PersonImplementation() throws RemoteException {
    }

    public Person retrieveInformation(String name) throws RemoteException {
        Person thijs = new Person();
        thijs.setName("Thijssen");
        thijs.setAge(20);
        System.out.println(thijs.getName() + " asked for their information.");
        return thijs;
    }
}