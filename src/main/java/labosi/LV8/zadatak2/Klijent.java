/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV8.zadatak2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author Bole
 */
public class Klijent {

    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] podaci = new byte[100];
        DatagramPacket prihvatniPaket = new DatagramPacket(
                podaci, podaci.length);

        Scanner input_ = new Scanner(System.in);
        String unos;
        System.out.println("Poruka: ");
        unos = input_.nextLine();
        podaci = unos.getBytes();

        DatagramPacket sPaket = new DatagramPacket(podaci, podaci.length,
                InetAddress.getLocalHost(), 5000);
        socket.send(sPaket);

        socket.receive(prihvatniPaket);
        System.out.println("\nPacket primljen:"
                + "\nHost: " + prihvatniPaket.getAddress()
                + "\nPort: " + prihvatniPaket.getPort()
                + "\nDuljina: " + prihvatniPaket.getLength()
                + "\nSadrži:\n\t" + new String(prihvatniPaket.getData(),
                        0, prihvatniPaket.getLength()));
    }
}
