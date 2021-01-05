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
public class Test {
    public static void main(String[] args) {
        Raketa raketa1 = new Raketa();
        Raketa raketa2 = new Raketa();
        Raketa raketa3 = new Raketa();
        raketa1.setIme("Big Rocket");
        raketa2.setIme("Medium Rocket");
        raketa3.setIme("Small Rocket");
        
        raketa1.start();
        raketa2.start();
        raketa3.start();
    }
}
