/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolokvij.zadatak3;


/**
 *
 * @author Bole
 */
public class Brojac extends Thread {


    public void run(String name) {
        if ("1".equals(name)) {
            for (int i = 0; i < 11; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        } else if ("0".equals(name)) {
            for (int i = 11; 0 < i; i--) {
                System.out.println(i-1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
}
