/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV2;

import static labosi.LV2.Zaposlenik.staticnaZarada;

/**
 *
 * @author Bole
 */
public class Test {
    public static void main(String[] args) {
        
        //TEST ZARULJE
        Zarulja osram= new Zarulja();
        osram.provjeri();
        osram.pritisniPrekidac();
        osram.provjeri();
        osram.pritisniPrekidac();
        osram.provjeri();
        osram.pritisniPrekidac();
        osram.provjeri();
        //TEST ZARULJE
        
        //TEST ZAPOSLENIKA
        Zaposlenik zaposlenik = new Zaposlenik();
        zaposlenik.setPlaca(3000);
        zaposlenik.setStaz(3);
        zaposlenik.zarada();
        staticnaZarada(zaposlenik);
        //TEST ZAPOSLENIKA
    }
}
