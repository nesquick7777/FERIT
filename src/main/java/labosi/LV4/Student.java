package labosi.LV4;

import java.math.BigDecimal;

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
    private BigDecimal prosjecna_ocjena;
}



/*Implementirati klasu koja predstavlja studenta (maticni broj, ime, prezime, fakultet,
smjer, godina,prosjecna_ocjena). Kroz petlju unijeti podatke za 10 studenata, zatim
učitati te podatke u datoteku te nakon toga učitati te iste podatke i izračunati
prosjek ocjena za sve studente. Koristiti serijalizaciju*/