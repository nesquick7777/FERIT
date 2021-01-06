/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV7.zadatak3;

import com.github.javafaker.Faker;

/**
 *
 * @author Bole
 */
public class Raketa implements Runnable {

    String ime;
    LansirnaRampa lansirnaRampa;
    public static final Object lock = new Object();

    @Override
    public void run() {

        lansirnaRampa = new LansirnaRampa();
        Faker faker = new Faker();
        ime = faker.color().name().toUpperCase() + " " + faker.space().star();

        try {
            synchronized (lock) {
                System.out.println(ime + ":");
                System.out.println("Pokrenuto lansiranje!");
                lansirnaRampa.lansiranje();
                System.out.println(ime + ":");
                System.out.println("Lansiranje je uspješno!");
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
