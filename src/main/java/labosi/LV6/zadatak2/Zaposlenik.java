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
public abstract class Zaposlenik {
    private String ID;
    private String ime;
    private String prezime;

    public Zaposlenik() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    public void predstaviSe(Object object){
        System.out.println("Ime: "+ this.getIme());
        System.out.println("Prezime: "+ this.getPrezime());
        System.out.println("ID: "+ this.getID());
        System.out.println(object.getClass().getSimpleName());
    }
    public void radi(){
    }
    
}
