/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolokvij.zadatak1;

import java.util.Random;

/**
 *
 * @author Bole
 */
public class Start {

    public static void main(String[] args) {
        Random rand = new Random();

        Test matrica = new Test();
        matrica.setM(3);
        String [][]matrica1=new String [matrica.getM()][matrica.getM()];
        String[] niz = {"_", "X", "O"};
        for (int i = 0; i < matrica.getM(); i++) {
            for (int j = 0; j < matrica.getM(); j++) {
                matrica1[i][j] = niz[rand.nextInt(3)];
            }
        }
        matrica.setMatrica(matrica1);
        matrica._xo(matrica.getM(), matrica.getMatrica());
    }
}
