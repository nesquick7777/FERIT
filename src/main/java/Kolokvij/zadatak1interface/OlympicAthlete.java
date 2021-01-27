/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolokvij.zadatak1interface;

/**
 *
 * @author Bole
 */
public final class OlympicAthlete implements OlympicMedal{
   private String medal;

    public String getMedal() {
        return medal;
    }

    public void setMedal(String medal) {
        this.medal = medal;
    }
   
   public OlympicAthlete(int id){
  }
   public void winEvent(){
    //the athlete gets a gold medal
    //note the reference is NOT qualified, as
    //in OlympicMedal.GOLD
    medal = GOLD;
  }
}
