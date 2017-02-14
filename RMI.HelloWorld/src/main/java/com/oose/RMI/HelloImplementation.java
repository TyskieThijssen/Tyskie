package com.oose.RMI;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Thijs on 10-2-2017.
 */
public class HelloImplementation extends UnicastRemoteObject implements HelloInterface, Serializable {
    public HelloImplementation() throws RemoteException {
    }

    public String helloTo(String name) throws RemoteException {
        System.out.println(name + " Joined the server!");
        return "Server says hello to " + name;
    }

    public String sayHello(String name) throws RemoteException {
        System.out.println(name + " said hello to the server!");
        return name + " says hello to the server!";
    }
}
