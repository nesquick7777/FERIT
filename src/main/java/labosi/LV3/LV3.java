/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV3;

import java.awt.HeadlessException;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Bole
 */
public class LV3 {

    public static void main(String[] args) {

        int n = 0, m = 0, izbornik = 0;
        Random random = new Random();
        do {
            try {
                m = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj elemenata kvadratne matrice, broj između 1 i 5"));
            } catch (Exception e) {
                System.out.println("Unesite broj.");
            }
        } while (m < 1 || m > 5);
        int[][] matrica = new int[m][m];
        System.out.println("Matrica: ");
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica.length; j++) {
                matrica[i][j] = random.nextInt(10);
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }

        do {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj maksimalnog broja elemenata vektora, broj između 2 i 10"));
            } catch (Exception e) {
                System.out.println("Unesite broj.");
            }
        } while (n < 2 || n > 10);
        Vector<Integer> v = new Vector<Integer>(n);
        System.out.println("Vektor: ");
        for (int i = 0; i < n; i++) {
            v.add(random.nextInt(10));
        }
        System.out.print(v);
        
        
        do {
            try {
                izbornik = Integer.parseInt(JOptionPane.showInputDialog("1. Izračun aritmetičke sredine sporedne dijagonale.\n"
                        + "2. Izračun sume neparnih elemenata prvog retka i prvog stupca matrice.\n"
                        + "3. Ispis svih brojeva na parnim indeksima vekora.\n"
                        + "Unesite bilo koji drugi broj za izlazak.\n"));
            } catch (Exception e) {
                System.out.println("Unesite broj.");
            }

            switch (izbornik) {
                case 1:
                    aritmetickaSredina(m, matrica);
                    break;
                case 2:
                    sumaNeparnihElemenata(matrica);
                    break;
                case 3:
                    ispisParnihIndeksa(v);
                    break;
                default:
                    System.out.println("Pozdrav!");
            }
        } while (izbornik >= 1 && izbornik <= 3);
    }

    public static void aritmetickaSredina(int m, int[][] matrica) {
        float suma = 0, brojac = 0;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica.length; j++) {
                if ((i + j) == (m - 1)) {
                    suma += matrica[i][j];
                    brojac++;
                }
            }
        }
        suma /= brojac;
        System.out.println("Aritmetička sredina sporedne dijagonale je: " + suma);
    }

    public static void sumaNeparnihElemenata(int[][] matrica) {
        int suma = 0;
        boolean check = false;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica.length; j++) {
                if (i == 0 || j == 0) {
                    if (matrica[i][j] % 2 != 0) {
                        suma += matrica[i][j];
                        check = true;
                    }
                }
            }
        }
        if (check) {
            System.out.println("Suma neparnih brojeva: " + suma);

        } else {
            System.out.println("Nema neparnih broja.");
        }
    }

    public static void ispisParnihIndeksa(Vector<Integer> v) {
        System.out.println("Ispis parnih indeksa vektora: ");
        for (int i = 0; i < v.size(); i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(v.elementAt(i) + " ");
        }
    }
}
