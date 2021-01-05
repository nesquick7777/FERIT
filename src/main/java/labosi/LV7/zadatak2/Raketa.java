/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV7.zadatak2;

import com.github.javafaker.Faker;

/**
 *
 * @author Bole
 */
public class Raketa implements Runnable{
    String ime;
    LansirnaRampa lansirnaLampa;

    @Override
    public void run(){
        lansirnaLampa = new LansirnaRampa();
        Faker faker = new Faker();
        ime =faker.color().name().toUpperCase()+" "+faker.space().star();
        try {
        System.out.println(ime +":");
        System.out.println("Pokrenuto lansiranje!");
        lansirnaLampa.lansiranje();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(ime+":");
        System.out.println("Lansiranje je uspješno!");
        
    }
}
