/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV6.zadatak1;

import java.util.Arrays;

/**
 *
 * @author Bole
 */
public class Test {

    public static void main(String[] args) {
        Zivotinja zivotinja = new Zivotinja();
        Konj konj = new Konj();
        Ptica ptica = new Ptica();
        Riba riba = new Riba();
        Zivotinja obj[] = new Zivotinja[4];
        obj[0] = zivotinja;
        obj[1] = konj;
        obj[2] = ptica;
        obj[3] = riba;

        zivotinja.kreceSe();
        konj.kreceSe();
        ptica.kreceSe();
        riba.kreceSe();

        for (Zivotinja Test : obj) {
            Test.kreceSe();
        }

    }
}
