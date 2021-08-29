package client;

import server.Server;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {

    public static void main(String args[]) {

        String HOST = "localhost";
        DataInputStream in;
        DataOutputStream out;
        int PUERTO = 5000;

        try {
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF("Hola desde el cliente!");
            String message = in.readUTF();
            System.out.println(message);

            sc.close();

        }catch (IOException e){
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, e);
        }



    }
}

