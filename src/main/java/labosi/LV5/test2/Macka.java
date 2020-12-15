/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV5.test2;

import labosi.LV5.test3.Sisavac;

/**
 *
 * @author Bole
 */
public class Macka extends Sisavac{
    private String pasminaMacke;

    public String getPasminaMacke() {
        return pasminaMacke;
    }

    public void setPasminaMacke(String pasminaMacke) {
        this.pasminaMacke = pasminaMacke;
    }
    
    public static void opis(Macka macka){
        System.out.println("Macka: ");
        System.out.println("Dob:"+macka.getDob()+" godina");
        System.out.println("Pasmina: "+macka.getPasminaMacke());
        System.out.println("Tezina: "+macka.getTezina()+" kg");
    }
}
