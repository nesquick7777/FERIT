/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV6.zadatak3;

/**
 *
 * @author Bole
 */
public class Test {

    public static void main(String[] args) {
        Konj konj = new Konj();
        Ptica ptica = new Ptica();
        Riba riba = new Riba();
        Zivotinja obj[] = new Zivotinja[3];
        obj[0] = konj;
        obj[1] = ptica;
        obj[2] = riba;
        
        konj.radi();
        konj.kreceSe();
        
        ptica.kreceSe();
        
        riba.kreceSe();

        for (Zivotinja Test : obj) {
            Test.kreceSe();
        }

    }
}
