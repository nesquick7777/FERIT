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
            }
            if ("X".equals(matrica[1][0]) && "X".equals(matrica[2][0])) {
                System.out.println("00");
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[2][2])) {
                System.out.println("00");
            }
        }
        // 01 slucaj
        if ("_".equals(matrica[0][1])) {
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[0][2])) {
                System.out.println("01");
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[2][1])) {
                System.out.println("01");
            }
        }

        //02 slucaj
        if ("_".equals(matrica[0][2])) {
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[0][1])) {
                System.out.println("02");
            }
            if ("X".equals(matrica[1][2]) && "X".equals(matrica[2][2])) {
                System.out.println("02");
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[2][0])) {
                System.out.println("02");
            }

        }
        //10 slucaj
        if ("_".equals(matrica[1][0])) {
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[2][0])) {
                System.out.println("10");
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[1][2])) {
                System.out.println("10");
            }
        }
        //11 slucaj
        if ("_".equals(matrica[1][1])) {
            if ("X".equals(matrica[0][1]) && "X".equals(matrica[2][1])) {
                System.out.println("11");
            }
            if ("X".equals(matrica[1][0]) && "X".equals(matrica[1][2])) {
                System.out.println("11");
            }
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[2][2])) {
                System.out.println("11");
            }
            if ("X".equals(matrica[0][2]) && "X".equals(matrica[2][0])) {
                System.out.println("11");
            }
        }

        //12 slucaj
        if ("_".equals(matrica[1][2])) {
            if ("X".equals(matrica[0][2]) && "X".equals(matrica[2][2])) {
                System.out.println("12");
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[1][0])) {
                System.out.println("12");
            }
        }

        // 20 slucaj
        if ("_".equals(matrica[2][0])) {
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[0][1])) {
                System.out.println("20");
            }
            if ("X".equals(matrica[1][1]) && "X".equals(matrica[0][2])) {
                System.out.println("20");
            }
            if ("X".equals(matrica[2][1]) && "X".equals(matrica[2][2])) {
                System.out.println("20");
            }
        }

        //21 slucaj
        if ("_".equals(matrica[2][1])) {
            if ("X".equals(matrica[2][0]) && "X".equals(matrica[2][2])) {
                System.out.println("21");
            }
            if ("X".equals(matrica[0][1]) && "X".equals(matrica[1][1])) {
                System.out.println("21");
            }
        }

        // 22 slucaj
        if ("_".equals(matrica[2][2])) {
            if ("X".equals(matrica[2][0]) && "X".equals(matrica[2][1])) {
                System.out.println("22");
            }
            if ("X".equals(matrica[0][2]) && "X".equals(matrica[1][2])) {
                System.out.println("22");
            }
            if ("X".equals(matrica[0][0]) && "X".equals(matrica[1][1])) {
                System.out.println("22");
            }
        }

    }
}
