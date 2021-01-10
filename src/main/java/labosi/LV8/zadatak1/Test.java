/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV8.zadatak1;


/**
 *
 * @author Bole
 */
public class Test {
    public static void main(String[] args) {
    Thread posluzitelj = new Thread(new Posluzitelj());
    Thread klijent = new Thread(new Klijent());
    
    posluzitelj.start();
    klijent.start();
    }
    
}
