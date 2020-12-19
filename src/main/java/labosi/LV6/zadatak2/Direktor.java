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
public class Direktor extends Zaposlenik{

    public Direktor() {
    }
    
    @Override
    public void radi(){
        System.out.println("Direktor: odlucujem");
    }
    
  //@Override 
    public void predstaviSe(){
        super.predstaviSe(this);
        System.out.println(this.getClass().getSimpleName());
    }
}
