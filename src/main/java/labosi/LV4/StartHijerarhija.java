package labosi.LV4;

import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bole
 */
public class StartHijerarhija {

    public static void main(String[] args) throws IOException {
        showDir(1, new File("C:"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        showDirUpperCase(1,new File("C:"));
    }

    static void showDir(int indent, File file) throws IOException {
        for (int i = 0; i < indent; i++) {
            System.out.print('-');
            System.out.println(file.getName());
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                showDir(indent + 4, file1);
            }
        }
    }

    static void showDirUpperCase(int indent, File file) throws IOException {
        for (int i = 0; i < indent; i++) {
            System.out.print('-');
            if (file.getName().length() < 1) {
            } else {
                if ((file.getName().charAt(0) >= 'A' && file.getName().charAt(0) <= 'N') || (file.getName().charAt(0) >= 'a' && file.getName().charAt(0) <= 'n')) {
                    if (file.getName().charAt(0) >= 'a' && file.getName().charAt(0) <= 'n') {

                        System.out.println(file.getName().substring(0, 1).toUpperCase() + file.getName().substring(1));
                    }
                } else if ((file.getName().charAt(0) >= 'O' && file.getName().charAt(0) <= 'Z') || (file.getName().charAt(0) >= 'o' && file.getName().charAt(0) <= 'z')) {
                    String last = file.getName().substring(file.getName().length() - 1);
                    if (last.charAt(0) >= 'o' && last.charAt(0) <= 'z') {

                        System.out.println(file.getName().toUpperCase());
                    }
                }
            }
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                showDirUpperCase(indent + 4, file1);
            }
        }
    }
}

/*Napisati program koji će ispisivati hijerarhiju sistemskog diska (ispisati dodatne
informacije kao što su “direktorij”, “datoteka”). Nakon što se ispiše hijerarhija,
ponovno proći kroz sve ali prilikom ispisa provjeriti da li naziv direktorija ili datoteke
počinje slovom između a - n (ako je malo početno prepraviti u veliko), a ako počinje
slovom između o - z (ako je zadnje slovo malo prepraviti kompletan naziv u velika
slova). */
