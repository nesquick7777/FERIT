/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV6.zadatak1;

/**
 *
 * @author Bole
 */
public class Zivotinja {
    protected String vrsta;

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public Zivotinja() {
    }
    
    
    
    public void kreceSe(){
        System.out.println("Zivotinja se krece");
    }
}
