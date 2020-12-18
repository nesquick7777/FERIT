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
public class Konj extends Zivotinja{

    @Override
    public String getVrsta() {
        return vrsta;
    }

    @Override
    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public Konj() {
    }
    @Override
    public void kreceSe(){
        System.out.println("Konj: trcim");
}
}
