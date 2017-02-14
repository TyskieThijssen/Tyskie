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

    public Person retrieveInformation(String name) throws RemoteException, NullPointerException {
        Person thijs = new Person();
        thijs.setName("Thijssen");
        thijs.setAge(20);

        Person sanne = new Person();
        sanne.setName("Derksen");
        sanne.setAge(16);

        if("Thijs".equalsIgnoreCase(name)){
            System.out.println(thijs.getName() + " asked for their information.");
            return thijs;
        } else if ("Sanne".equalsIgnoreCase(name)){
            System.out.println(sanne.getName() + " asked for their information.");
            return sanne;
        } else {
            System.out.println("Unkown name asked for their information.");
            return null;
        }
    }
}