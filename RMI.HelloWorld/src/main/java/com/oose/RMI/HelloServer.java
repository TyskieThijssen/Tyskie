package com.oose.RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Thijs on 10-2-2017.
 */
public class HelloServer {
    protected HelloServer() throws RemoteException{
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Naming.rebind("HelloServer", new HelloImplementation());
            System.err.println("Server is ready!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
