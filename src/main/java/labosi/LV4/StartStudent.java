/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi.LV4;

import java.util.ArrayList;
import java.util.List;
import com.github.javafaker.Faker;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Bole
 */
public class StartStudent {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Faker faker = new Faker();
        Student student;
        List<Student> studenti = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            student = new Student();
            student.setIme(faker.name().firstName());
            student.setPrezime(faker.name().lastName());
            student.setFakultet(faker.university().name());
            student.setGodina((int) (Math.random() * (4 - 1 + 1)) + 1);
            student.setMaticniBroj(1234567890 + i);
            student.setSmjer(faker.job().field());
            int rand1 = (int) (Math.random() * (5 - 1 + 1) + 1);
            int rand2 = (int) (Math.random() * (5 - 1 + 1) + 1);
            int rand3 = (int) (Math.random() * (5 - 1 + 1) + 1);
            student.setProsjecna_ocjena((double) (rand1 + rand2 + rand3) / 3);
            studenti.add(student);
        }

        System.out.println();

        try (FileOutputStream fileOut = new FileOutputStream("D:\\Downloads\\student.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            int brojac = 0;
            for (Student test : studenti) {
                try {
                    out.writeObject(test);
                    brojac++;
                    System.out.println(brojac + ". " + "Serialized data is saved in Downloads");
                } catch (IOException i) {
                }
            }
        }
        

        student = null;
        try (FileInputStream fileIn = new FileInputStream("D:\\Downloads\\student.ser"); 
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            double prosjek = 0;
            for (int j = 0; j < 10; j++) {
                try {
                    student = (Student) in.readObject();
                    prosjek += student.getProsjecna_ocjena();
                } catch (IOException i) {
                    return;
                } catch (ClassNotFoundException c) {
                    System.out.println("Student class not found");
                    return;
                }
                System.out.println((j+1)+". "+"Deserialized Student...");
                System.out.println("Ime: " + student.getIme());
                System.out.println("Prezime: " + student.getPrezime());
                System.out.println("Fakultet: " + student.getFakultet());
                System.out.println("Smjer: " + student.getSmjer());
                System.out.println("Godina: " + student.getGodina());
                System.out.println("Maticni broj: " + student.getMaticniBroj());
                System.out.println("Ocjena: " + student.getProsjecna_ocjena());
                System.out.println("-------------------------------------------------------");
            }
            prosjek /= 10;
            System.out.println("Prosjek svih studenata:");
            System.out.println(prosjek);
        }

    }
}
