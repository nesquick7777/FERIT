/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV2;

/**
 *
 * @author Bole
 */
public class Zarulja {

    private boolean stanje;

    public Zarulja() {
    }

    public boolean pritisniPrekidac() {
        if (stanje == false) {
            return stanje = true;
        } else {
            return stanje = false;
        }
    }

    public void provjeri() {
        if (stanje == true) {
            System.out.println("Svijetli.");
        } else {
            System.out.println("Mrak je.");
        }
    }
}
