/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kolokvij.zadatak1;

/**
 *
 * @author Bole
 */
public abstract class Matrica {
    int m;
    String [][] matrica= new String[m][m];

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public String[][] getMatrica() {
        return matrica;
    }

    public void setMatrica(String[][] matrica) {
        this.matrica = matrica;
    }
    
    public abstract void _xo(int m, String [][] matrica);
    
}
