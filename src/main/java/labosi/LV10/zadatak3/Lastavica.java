package labosi.LV10.zadatak3;



/**
 *
 * @author Bole
 */
public class Lastavica extends Ptica{
    String ime;

    @Override
    public String getIme() {
        return ime;
    }
   
    @Override
    public void setIme(String ime) {
        this.ime = ime;
    }
    
    
    @Override
    public void glasajSe(){
        System.out.println(getIme() +": Crrr");
    }
    
}
