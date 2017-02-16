package com.oose.rmi;

        import java.net.MalformedURLException;
        import java.rmi.Naming;
        import java.rmi.RemoteException;
        import java.rmi.registry.LocateRegistry;

/**
 * Created by Thijs on 10-2-2017.
 */
public class PersonServer {
    public static void main(String[] args) throws RemoteException {
        try {
            LocateRegistry.createRegistry(1099);
            Naming.rebind("PersonServer", new PersonImplementation());
            System.err.println("Server ready!");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
