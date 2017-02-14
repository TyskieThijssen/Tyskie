package com.oose.RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Thijs on 10-2-2017.
 */
public class HelloClient {
    private static HelloInterface look_up;
    private static HelloInterface account;

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        look_up = (HelloInterface) Naming.lookup("HelloServer");
        System.out.println(look_up.helloTo("Tyskie"));
        System.out.println(look_up.sayHello("Tyskie"));

        account = (HelloInterface) Naming.lookup("HelloServer");
        System.out.println(account.helloTo("Thijs"));
    }
}
