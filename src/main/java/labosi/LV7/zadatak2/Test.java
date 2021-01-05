/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV7.zadatak2;

/**
 *
 * @author Bole
 */
public class Test {
    public static void main(String[] args) {
        Thread raketa1 = new Thread(new Raketa());
        Thread raketa2 = new Thread(new Raketa());
        Thread raketa3 = new Thread(new Raketa());
        raketa1.start();
        raketa2.start();
        raketa3.start();
    }
}
