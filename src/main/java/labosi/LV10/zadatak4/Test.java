/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV10.zadatak4;

/**
 *
 * @author Bole
 */
public class Test {
    public static void main(String[] args) {
        TestAutomobila auto1 = new TestAutomobila();
        TestAutomobila auto2 = new TestAutomobila();
        auto1.setNaziv("Golf");
        auto1.setPostrosioGoriva(55);
        auto1.setPrijedjenPut(800);
        
        auto2.setNaziv("Lamborghini");
        auto2.setPostrosioGoriva(70);
        auto2.setPrijedjenPut(700);
        
        UsporedbaPotrosnje.usporedi(auto1, auto2);
    }
}
