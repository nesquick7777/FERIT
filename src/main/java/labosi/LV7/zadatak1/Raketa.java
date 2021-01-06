/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV7.zadatak1;

/**
 *
 * @author Bole
 */
public class Raketa extends Thread{
    String ime;
    LansirnaRampa lansirnaRampa;

    public Raketa() {
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public void run(){
        lansirnaRampa = new LansirnaRampa();
        try {
        System.out.println(this.ime+":");
        System.out.println("Pokrenuto lansiranje!");
        lansirnaRampa.lansiranje();
        } catch (Exception e) {
            System.out.println("Greška pri lansiranju");
        }
        System.out.println(this.ime+":");
        System.out.println("Lansiranje je uspješno!");
        
    }
}
