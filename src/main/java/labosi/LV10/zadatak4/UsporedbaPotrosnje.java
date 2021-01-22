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
public class UsporedbaPotrosnje {
    public static void usporedi( TestAutomobila prvi, TestAutomobila drugi){
        double prosjek1 = (prvi.getPostrosioGoriva()/prvi.getPrijedjenPut())*100;
        double prosjek2 = (drugi.getPostrosioGoriva()/drugi.getPrijedjenPut())*100;
        System.out.println(prvi.getNaziv()+" trosi: "+prosjek1+"L");
        System.out.println(drugi.getNaziv()+" trosi: "+prosjek2+"L");
        if(prosjek1 > prosjek2){
            System.out.println(drugi.getNaziv()+" trosi manje L od "+ prvi.getNaziv());
        }else if(prosjek1 == prosjek2){
            System.out.println(prvi.getNaziv()+" i "+drugi.getNaziv()+ " trose isto");
        }else{
            System.out.println(prvi.getNaziv()+" trosi manje L od "+ drugi.getNaziv());
        }
    }
}
