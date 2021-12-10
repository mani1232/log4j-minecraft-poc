package net.cyberflame.mcvulnlog4j;

import org.apache.logging.log4j.core.net.server.ObjectInputStreamLogEventBridge;
import org.apache.logging.log4j.core.net.server.TcpSocketServer;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) 
    {
        TcpSocketServer<ObjectInputStream> server = null;
        try 
        {
            myServer = new TcpSocketServer<>(3710, new ObjectInputStreamLogEventBridge());
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        server.run();
    }

}