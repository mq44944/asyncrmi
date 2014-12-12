package org.async.example.ssl;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Barak Bar Orion
 * 12/9/14.
 */
public interface Server extends Remote {
    public final static String SER_FILE_NAME = "ssl.server.ser";

    String echo(String msg) throws RemoteException;
}
