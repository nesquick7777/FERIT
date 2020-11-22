/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV3;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Bole
 */
public class Objekat {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    
    
    public int[][] matrica() {
        int m = 0;
        do {
            try {
                System.out.println("Unesite broj elemenata kvadratne matrice, broj između 1 i 5");
                m = scanner.nextInt();
            } catch (Exception e) {
                scanner.next();
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
        return matrica;
    }

    public Vector<Integer> vektor() {
        int n = 0;
        do {
            try {
                System.out.println("Unesite broj maksimalnog broja elemenata vektora, broj između 2 i 10");
                n = scanner.nextInt();
            } catch (Exception e) {
                scanner.next();
            }
        } while (n < 2 || n > 10);
        Vector<Integer> v = new Vector<Integer>(n);
        System.out.println("Vektor: ");
        for (int i = 0; i < n; i++) {
            v.add(random.nextInt(10));
        }
        System.out.print(v);
        System.out.println();
        return v;
    }

    public void izbornik(int[][] matrica, Vector<Integer> v) {
        int izbornik = 1;
        do {
            try {
                System.out.println("---------------------------------------------------------\n"
                        + "1. Izračun aritmetičke sredine sporedne dijagonale.\n"
                        + "2. Izračun sume neparnih elemenata prvog retka i prvog stupca matrice.\n"
                        + "3. Ispis svih brojeva na parnim indeksima vekora.\n"
                        + "Unesite bilo koji drugi broj za izlaz.\n"
                        + "---------------------------------------------------------\n");
                izbornik = scanner.nextInt();
            } catch (Exception e) {
                scanner.next();
                System.out.println("Unesite broj.");
                continue;
            }

            switch (izbornik) {
                case 1:
                    aritmetickaSredina(matrica);
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

    public void aritmetickaSredina(int[][] matrica) {
        float suma = 0, brojac = 0;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica.length; j++) {
                if ((i + j) == (matrica.length - 1)) {
                    suma += matrica[i][j];
                    brojac++;
                }
            }
        }
        suma /= brojac;
        System.out.println("Aritmetička sredina sporedne dijagonale je: " + suma);
    }

    public void sumaNeparnihElemenata(int[][] matrica) {
        int suma = 0;
        boolean check = false;
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica.length; j++) {
                if (i == 0 || j == 0) {
                    if ((float) matrica[i][j] % 2 != 0) {
                        suma += matrica[i][j];
                        check = true;
                    }
                }
            }
        }
        if (check) {
            System.out.println("Suma neparnih brojeva: " + suma);

        } else {
            System.out.println("Nema neparnih brojeva.");
        }
    }

    public void ispisParnihIndeksa(Vector<Integer> v) {
        System.out.println("Ispis brojeva koji se nalaze na parnom indeksu vektora: ");
        for (int i = 1; i < v.size(); i++) {
            if ((float) i % 2 != 0) {
                continue;
            }
            System.out.print(v.elementAt(i) + " ");
        }
        System.out.println();
    }
}
