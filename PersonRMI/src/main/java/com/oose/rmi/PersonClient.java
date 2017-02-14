package com.oose.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Thijs on 10-2-2017.
 */
public class PersonClient {
    public static void main(String[] args) throws RemoteException {
        try {
            PersonInterface personInterface = (PersonInterface) Naming.lookup("PersonServer");
            Person p1 = personInterface.retrieveInformation("Thijs");
            System.out.println("Name: " + p1.getName() + "\nAge: " + p1.getAge());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("De persoon bestaat niet.");
        }
    }
}
