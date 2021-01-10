/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV8.zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bole
 */
public class Posluzitelj implements Runnable{

    
    @Override
    public void run(){
        try {
            String linija;
            BufferedReader is;
            PrintWriter os;
            ServerSocket echoServer;
            Socket clientSocket;
            
            echoServer = new ServerSocket();
            echoServer.bind(new InetSocketAddress("127.0.0.1", 9999));
            System.out.println("Postavljeni posluzitelj:" + "" + echoServer.toString());
            
            clientSocket = echoServer.accept();
            System.out.println("Server>> Imamo klijenta: " + clientSocket.getInetAddress());
            is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            os = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
            boolean done = false;
            
            while (!done && (linija = is.readLine()) != null) {
                if("psovka2".equals(linija) || "uvreda3".equals(linija)){
                linija="*******";
                    os.println("Echo: " + linija);
                }else{
                    os.println("Echo: " + linija.toUpperCase());
                }
                if (linija.trim().equals("BYE")) {
                    done = true;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Posluzitelj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
