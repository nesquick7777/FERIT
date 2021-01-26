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
public class Test extends Matrica {

    @Override
    public void _xo(int m, String[][] matrica) {
        boolean stanje = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
        // 00 slucaj
        if ("_".equals(matrica[0][0])) {
            if ("X".equals(matrica[0][1]) && "X".equals(matrica[0][2])) {
                System.out.println("00");
                stanje=true;
            }
            if ("X".equals(matrica[1][0]) && "X".equals(matrica[2][0])) {
                System.out.println("00");
                stanje=true;
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[2][2])) {
                System.out.println("00");
                stanje=true;
            }
        }
        // 01 slucaj
        if ("_".equals(matrica[0][1])) {
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[0][2])) {
                System.out.println("01");
                stanje=true;
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[2][1])) {
                System.out.println("01");
                stanje=true;
            }
        }

        //02 slucaj
        if ("_".equals(matrica[0][2])) {
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[0][1])) {
                System.out.println("02");
                stanje=true;
            }
            if ("X".equals(matrica[1][2]) && "X".equals(matrica[2][2])) {
                System.out.println("02");
                stanje=true;
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[2][0])) {
                System.out.println("02");
                stanje=true;
            }

        }
        //10 slucaj
        if ("_".equals(matrica[1][0])) {
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[2][0])) {
                System.out.println("10");
                stanje=true;
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[1][2])) {
                System.out.println("10");
                stanje=true;
            }
        }
        //11 slucaj
        if ("_".equals(matrica[1][1])) {
            if ("X".equals(matrica[0][1]) && "X".equals(matrica[2][1])) {
                System.out.println("11");
                stanje=true;
            }
            if ("X".equals(matrica[1][0]) && "X".equals(matrica[1][2])) {
                System.out.println("11");
                stanje=true;
            }
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[2][2])) {
                System.out.println("11");
                stanje=true;
            }
            if ("X".equals(matrica[0][2]) && "X".equals(matrica[2][0])) {
                System.out.println("11");
                stanje=true;
            }
        }

        //12 slucaj
        if ("_".equals(matrica[1][2])) {
            if ("X".equals(matrica[0][2]) && "X".equals(matrica[2][2])) {
                System.out.println("12");
                stanje=true;
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[1][0])) {
                System.out.println("12");
                stanje=true;
            }
        }

        // 20 slucaj
        if ("_".equals(matrica[2][0])) {
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[0][1])) {
                System.out.println("20");
                stanje=true;
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[0][2])) {
                System.out.println("20");
                stanje=true;
            }
            if ("X".equals(matrica[2][1]) && "X".equals(matrica[2][2])) {
                System.out.println("20");
                stanje=true;
            }
        }

        //21 slucaj
        if ("_".equals(matrica[2][1])) {
            if ("X".equals(matrica[2][0]) && "X".equals(matrica[2][2])) {
                System.out.println("21");
                stanje=true;
            }
            if ("X".equals(matrica[0][1]) && "X".equals(matrica[1][1])) {
                System.out.println("21");
                stanje=true;
            }
        }

        // 22 slucaj
        if ("_".equals(matrica[2][2])) {
            if ("X".equals(matrica[2][0]) && "X".equals(matrica[2][1])) {
                System.out.println("22");
                stanje=true;
            }
            if ("X".equals(matrica[0][2]) && "X".equals(matrica[1][2])) {
                System.out.println("22");
                stanje=true;
            }
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[1][1])) {
                System.out.println("22");
                stanje=true;
            }
        }
if(!stanje){
    System.out.println("Rijesenje za pobjedu X igraca u ovom krugu ne postoji.");
}
    }
}
