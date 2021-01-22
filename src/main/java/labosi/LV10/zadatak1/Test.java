/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV10.zadatak1;

/**
 *
 * @author Bole
 */
public class Test {
    public static void main(String[] args) {
        Ptica ptica = new Ptica();
        Lastavica lastavica = new Lastavica();
        
        ptica.setIme("Cool Ptica");
        System.out.println("PTICA: "+ptica.getIme());
        ptica.glasajSe();
        
        lastavica.setIme("Cool Lastavica");
        System.out.println("LASTAVICA: "+lastavica.getIme());
        lastavica.glasajSe();
        
    }
}
