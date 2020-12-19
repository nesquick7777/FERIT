/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV6.zadatak2;

/**
 *
 * @author Bole
 */
public class Test {

    public static void main(String[] args) {
        Direktor direktor = new Direktor();
        Tajnica tajnica = new Tajnica();
        Vozac vozac = new Vozac();

        direktor.setPrezime("Dobar");
        direktor.setIme("Dobar");
        direktor.setID("1");

        tajnica.setPrezime("Los");
        tajnica.setIme("Los");
        tajnica.setID("2");

        vozac.setPrezime("Zao");
        vozac.setIme("Zao");
        vozac.setID("3");

        direktor.radi();
        tajnica.radi();
        vozac.radi();
        System.out.println();
        System.out.println("Direktor:");
        direktor.predstaviSe();
        System.out.println();
        System.out.println("Tajnica:");
        tajnica.predstaviSe(tajnica);
        System.out.println();
        System.out.println("Vozac:");
        vozac.predstaviSe(vozac);
    }

}
