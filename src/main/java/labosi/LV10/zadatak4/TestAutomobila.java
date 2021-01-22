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
public class TestAutomobila {

    public TestAutomobila() {
    }

    public TestAutomobila(String naziv, double postrosioGoriva, double prijedjenPut) {
        this.naziv = naziv;
        this.postrosioGoriva = postrosioGoriva;
        this.prijedjenPut = prijedjenPut;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getPostrosioGoriva() {
        return postrosioGoriva;
    }

    public void setPostrosioGoriva(double postrosioGoriva) {
        this.postrosioGoriva = postrosioGoriva;
    }

    public double getPrijedjenPut() {
        return prijedjenPut;
    }

    public void setPrijedjenPut(double prijedjenPut) {
        this.prijedjenPut = prijedjenPut;
    }
    
    private String naziv;
    private double postrosioGoriva;
    private double prijedjenPut;
            
}
