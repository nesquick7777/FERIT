/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV5.test1;

import labosi.LV5.test3.Sisavac;

/**
 *
 * @author Bole
 */
public class Pas extends Sisavac{
    private String pasminaPsa;

    public String getPasminaPsa() {
        return pasminaPsa;
    }

    public void setPasminaPsa(String pasminaPsa) {
        this.pasminaPsa = pasminaPsa;
    }
    public static void opis(Pas pas){
        System.out.println("Pas: ");
        System.out.println("Dob: "+pas.getDob()+" godina");
        System.out.println("Pasmina: "+pas.getPasminaPsa());
        System.out.println("Tezina: "+pas.getTezina()+" kg");
    }
}
