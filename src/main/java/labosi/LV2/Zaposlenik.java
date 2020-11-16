/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV2;

/**
 *
 * @author Bole
 */
public class Zaposlenik {
    
    private int staz;
    private int starost;
    private int placa;

    public Zaposlenik() {
    }

    
    
    public Zaposlenik(int staz, int starost, int placa) {
        this.staz = staz;
        this.starost = starost;
        this.placa = placa;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
    
    public void zarada(){
      int ukupnaPlaca;
        ukupnaPlaca = (staz*12) * placa;
        System.out.println("Ukupna zarada:" + ukupnaPlaca);
    }
    
    public static void staticnaZarada(Zaposlenik zarada){
        int ukupnaPlaca;
        ukupnaPlaca = zarada.placa * (12 * zarada.staz);
        System.out.println("Ukupna zarada:" + ukupnaPlaca);
    }
}
