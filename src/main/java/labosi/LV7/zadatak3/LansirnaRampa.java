/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV7.zadatak3;

/**
 *
 * @author Bole
 */
public class LansirnaRampa {

    public void lansiranje() throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
