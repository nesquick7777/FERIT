/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV5;

import labosi.LV5.test3.Sisavac;
import labosi.LV5.test2.Macka;
import labosi.LV5.test1.Pas;

/**
 *
 * @author Bole
 */
public class Test {

    public static void main(String[] args) {
        Sisavac sisavac = new Sisavac();
        Macka macka = new Macka();
        Pas pas = new Pas();
        
        sisavac.setDob(2);
        sisavac.setTezina(50);
        
        macka.setPasminaMacke("Perzijska");
        macka.setDob(3);
        macka.setTezina(3);
        
        pas.setPasminaPsa("Ovcar");
        pas.setDob(2);
        pas.setTezina(5);
        
        Macka.opis(macka);
        System.out.println();
        Pas.opis(pas);
        
    }

}
