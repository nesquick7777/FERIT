/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV10.zadatak2;

/**
 *
 * @author Bole
 */
public class Ptica implements Zivotinja{
String ime;

 @Override
    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String getIme() {
        return this.ime;
    }

    @Override
    public void glasajSe() {
        System.out.println(getIme()+": Piju");
    }
}
