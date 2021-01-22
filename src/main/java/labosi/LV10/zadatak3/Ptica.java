package labosi.LV10.zadatak3;


/**
 *
 * @author Bole
 */
public class Ptica implements Zivotinja{
String ime;

 @Override
    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String getIme() {
        return this.ime;
    }

    @Override
    public void glasajSe() {
        System.out.println(getIme()+": Piju");
    }
}
