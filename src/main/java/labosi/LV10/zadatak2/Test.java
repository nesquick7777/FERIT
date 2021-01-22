package labosi.LV10.zadatak2;

/**
 *
 * @author Bole
 */
public class Test {

    public static void main(String[] args) {
        Ptica ptica = new Ptica();
        Lastavica lastavica = new Lastavica();
        Zivotinja obj[] = new Zivotinja[2];
        obj[0] = ptica;
        obj[0].setIme("Cool Ptica");
        obj[1] = lastavica;
        obj[1].setIme("Cool Lastavica");

        for (Zivotinja test : obj) {
            System.out.println(test.getIme());
            test.glasajSe();
        }

    }
}
