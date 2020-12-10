package labosi.LV4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bole
 */
public class Student {
    private int maticniBroj;
    private String ime;
    private String prezime;
    private String fakultet;
    private String smjer;
    private int godina;
    private double prosjecna_ocjena;

    public Student() {
    }

    public Student(int maticniBroj, String ime, String prezime, String fakultet, String smjer, int godina, double prosjecna_ocjena) {
        this.maticniBroj = maticniBroj;
        this.ime = ime;
        this.prezime = prezime;
        this.fakultet = fakultet;
        this.smjer = smjer;
        this.godina = godina;
        this.prosjecna_ocjena = prosjecna_ocjena;
    }

    
    
    public int getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(int maticniBroj) {
        this.maticniBroj = maticniBroj;
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

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getSmjer() {
        return smjer;
    }

    public void setSmjer(String smjer) {
        this.smjer = smjer;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public double getProsjecna_ocjena() {
        return prosjecna_ocjena;
    }

    public void setProsjecna_ocjena(double prosjecna_ocjena) {
        this.prosjecna_ocjena = prosjecna_ocjena;
    }
    
    
}



/*Implementirati klasu koja predstavlja studenta (maticni broj, ime, prezime, fakultet,
smjer, godina,prosjecna_ocjena). Kroz petlju unijeti podatke za 10 studenata, zatim
učitati te podatke u datoteku te nakon toga učitati te iste podatke i izračunati
prosjek ocjena za sve studente. Koristiti serijalizaciju*/